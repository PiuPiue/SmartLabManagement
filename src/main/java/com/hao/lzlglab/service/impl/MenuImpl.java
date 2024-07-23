package com.hao.lzlglab.service.impl;

import com.hao.lzlglab.dao.SysMenuDao;
import com.hao.lzlglab.entity.SysMenu;
import com.hao.lzlglab.entity.SysMenuExample;
import com.hao.lzlglab.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuImpl implements MenuService {

    @Autowired
    private SysMenuDao sysMenuDao;

    @Override
    public List<SysMenu> getMenuTree() {
        SysMenuExample example = new SysMenuExample();
        List<SysMenu> list = sysMenuDao.selectByExample(example);
        return list;
    }

    @Override
    public List<SysMenu> getMenuByParent(String parentId) {
        SysMenuExample example = new SysMenuExample();
        example.createCriteria().andParentIdEqualTo(Long.valueOf(parentId));
        List<SysMenu> list = sysMenuDao.selectByExample(example);
        return list;
    }

    @Override
    public void saveOrUpdate(SysMenu menu) {
        if (menu.getMenuId() == null) {
            sysMenuDao.insertSelective(menu);
        } else {
            sysMenuDao.updateByPrimaryKeySelective(menu);
        }
    }

    @Override
    public void delete(String id) {
        SysMenuExample example = new SysMenuExample();
        example.createCriteria().andParentIdEqualTo(Long.valueOf(id));
        if (sysMenuDao.countByExample(example) > 0) {
            throw new RuntimeException("该菜单下有子菜单，不能删除");
        }
        sysMenuDao.deleteByPrimaryKey(Long.valueOf(id));
    }


}
