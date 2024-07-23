package com.hao.lzlglab.service;

import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.entity.SysUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsersService {

    /**
     * 查询所有用户
     * @return
     */
    List<SysUser> getAllUser();

    /**
     * 新增或修改用户
     *
     * @param sysUser
     * @param roles
     */
    void saveOrUpdate(SysUser sysUser, List<Integer> roles);

    void deleteUserById(Integer id);

    PageInfo<SysUser> getAllUserByCondition(Integer pageNum, Integer pageSize, String name);

    void login(String userName, String passWord);

    void deleteBanch(List<String> ids);
}
