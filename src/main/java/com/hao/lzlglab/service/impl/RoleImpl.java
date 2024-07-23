package com.hao.lzlglab.service.impl;

import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.dao.SysMenuDao;
import com.hao.lzlglab.dao.SysRoleDao;
import com.hao.lzlglab.dao.SysRoleMenuDao;
import com.hao.lzlglab.entity.SysRole;
import com.hao.lzlglab.entity.SysRoleExample;
import com.hao.lzlglab.entity.SysRoleMenu;
import com.hao.lzlglab.entity.SysRoleMenuExample;
import com.hao.lzlglab.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RoleImpl implements RoleService {

    @Autowired
    private SysRoleDao sysRoleDao;

    @Autowired
    private SysRoleMenuDao sysRoleMenuDao;

    @Override
    public List<SysRole> getAllRole() {
        SysRoleExample sysRoleExample = new SysRoleExample();
        return sysRoleDao.selectByExample(sysRoleExample);
    }

    @Override
    public PageInfo<SysRole> getAllRoleByCondition(Integer pageNum, Integer pageSize, String key) {
        PageHelper.startPage(pageNum,pageSize);
        SysRoleExample sysRoleExample = new SysRoleExample();
        if(!StrUtil.isEmpty(key)){
            sysRoleExample.createCriteria().andRoleNameLike("%"+key+"%");
        }
        List<SysRole> list = sysRoleDao.selectByExample(sysRoleExample);
        PageInfo<SysRole> roleList = new PageInfo<>(list);
        return roleList;
    }

    @Override
    public void saveOrUpdateRole(SysRole sysRole, List<String> menus) {
        if (sysRole.getRoleId() == null) {
            // 新增角色
            sysRole.setCreateTime(LocalDateTime.now());
            sysRoleDao.insertSelective(sysRole);

            SysRoleExample sysRoleExample = new SysRoleExample();
            sysRoleExample.createCriteria().andRoleNameEqualTo(sysRole.getRoleName());
            List<SysRole> list = sysRoleDao.selectByExample(sysRoleExample);
            String id = list.get(0).getRoleId().toString();

            // 插入角色菜单关系
            for (String menuId : menus) {
                SysRoleMenu sysRoleMenu = new SysRoleMenu();
                sysRoleMenu.setRoleId(Long.valueOf(id));
                sysRoleMenu.setMenuId(Long.valueOf(menuId));
                sysRoleMenuDao.insert(sysRoleMenu);
            }
        } else {
            // 更新角色
            sysRoleDao.updateByPrimaryKeySelective(sysRole);

            // 删除旧的角色菜单关系
            SysRoleMenuExample sysRoleMenuExample = new SysRoleMenuExample();
            sysRoleMenuExample.createCriteria().andRoleIdEqualTo(sysRole.getRoleId());
            sysRoleMenuDao.deleteByExample(sysRoleMenuExample);

            // 插入新的角色菜单关系
            for (String menuId : menus) {
                SysRoleMenu sysRoleMenu = new SysRoleMenu();
                sysRoleMenu.setRoleId(sysRole.getRoleId());
                sysRoleMenu.setMenuId(Long.valueOf(menuId));
                sysRoleMenuDao.insert(sysRoleMenu);
            }
        }
    }

    @Override
    public void deleteById(Integer id) {
        Long roleId = Long.valueOf(id);

        // 删除角色菜单关联
        SysRoleMenuExample sysRoleMenuExample = new SysRoleMenuExample();
        sysRoleMenuExample.createCriteria().andRoleIdEqualTo(roleId);
        sysRoleMenuDao.deleteByExample(sysRoleMenuExample);

        // 删除角色
        sysRoleDao.deleteByPrimaryKey(roleId);
    }

}
