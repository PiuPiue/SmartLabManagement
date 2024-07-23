package com.hao.lzlglab.service.security;

import com.hao.lzlglab.dao.SysMenuDao;
import com.hao.lzlglab.dao.SysRoleDao;
import com.hao.lzlglab.dao.SysUserDao;
import com.hao.lzlglab.dao.SysUserRoleDao;
import com.hao.lzlglab.dao.ex.MenuExtMapper;
import com.hao.lzlglab.dao.ex.RoleExtMapper;
import com.hao.lzlglab.entity.SysMenu;
import com.hao.lzlglab.entity.SysRole;
import com.hao.lzlglab.entity.SysUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private SysUserDao sysUserDao;
    @Autowired
    private RoleExtMapper roleExtMapper;
    @Autowired
    private MenuExtMapper menuExtMapper;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUserExample example = new SysUserExample();
        System.out.println(username + "------------------------------------");
        example.createCriteria().andUsernameEqualTo(username);
        List<com.hao.lzlglab.entity.SysUser> users = sysUserDao.selectByExample(example);
        if (users.isEmpty()) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        com.hao.lzlglab.entity.SysUser user = users.get(0);

        ArrayList<GrantedAuthority> authorities = new ArrayList<>();
        List<SysRole> list = roleExtMapper.selectRolesByUserId(String.valueOf(user.getUserId()));
        for (SysRole role : list) {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName()));
            List<SysMenu> menuByRoleId = menuExtMapper.getMenuByRoleId(String.valueOf(role.getRoleId()));
            for (SysMenu sysMenu : menuByRoleId) {
                if (sysMenu.getUrl() != null && !sysMenu.getUrl().trim().isEmpty()) {
                    authorities.add(new SimpleGrantedAuthority(sysMenu.getUrl()));
                }
                if (sysMenu.getPerms() != null && !sysMenu.getPerms().trim().isEmpty()) {
                    authorities.add(new SimpleGrantedAuthority(sysMenu.getPerms()));
                }
                if (sysMenu.getName() != null && !sysMenu.getName().trim().isEmpty()) {
                    authorities.add(new SimpleGrantedAuthority(sysMenu.getName()));
                }
            }
        }

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
    }

}
