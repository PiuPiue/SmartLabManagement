package com.hao.lzlglab.service;

import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.entity.SysRole;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
    List<SysRole> getAllRole();

    PageInfo<SysRole> getAllRoleByCondition(Integer pageNum, Integer pageSize, String key);

    void saveOrUpdateRole(SysRole sysRole, List<String> menus);

    void deleteById(Integer id);
}
