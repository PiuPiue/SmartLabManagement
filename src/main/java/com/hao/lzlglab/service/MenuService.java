package com.hao.lzlglab.service;

import com.hao.lzlglab.entity.SysMenu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuService {
    List<SysMenu> getMenuTree();

    List<SysMenu> getMenuByParent(String parentId);

    void saveOrUpdate(SysMenu menu);

    void delete(String id);
}
