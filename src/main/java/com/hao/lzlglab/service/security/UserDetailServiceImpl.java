package com.hao.lzlglab.service.security;

import com.hao.lzlglab.dao.SysUserDao;
import com.hao.lzlglab.entity.SysUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private SysUserDao sysUserDao;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUserExample example = new SysUserExample();
        System.out.println(username+"------------------------------------");
        example.createCriteria().andUsernameEqualTo(username);
        com.hao.lzlglab.entity.SysUser user = sysUserDao.selectByExample(example).get(0);
        if (sysUserDao.selectByExample(example).size() == 0) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),new ArrayList<>());
    }
}
