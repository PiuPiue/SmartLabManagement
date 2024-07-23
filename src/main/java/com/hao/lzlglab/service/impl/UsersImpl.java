package com.hao.lzlglab.service.impl;

import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.dao.SysUserDao;
import com.hao.lzlglab.dao.SysUserRoleDao;
import com.hao.lzlglab.entity.SysUser;
import com.hao.lzlglab.entity.SysUserExample;
import com.hao.lzlglab.entity.SysUserRole;
import com.hao.lzlglab.entity.SysUserRoleExample;
import com.hao.lzlglab.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Service
public class UsersImpl implements UsersService {

    @Autowired
    SysUserDao sysUserDao;
    @Autowired
    private SysUserRoleDao sysUserRoleDao;

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<SysUser> getAllUser() {
        SysUserExample sysUserExample = new SysUserExample();
        return sysUserDao.selectByExample(sysUserExample);
    }

    /**
     * 新增或修改用户
     *
     * @param sysUser
     * @param roles
     */
    @Override
    public void saveOrUpdate(SysUser sysUser, List<Integer> roles) {
        if (sysUser.getUserId() == null) {
            // 新增用户
            sysUser.setCreateTime(Date.valueOf(LocalDate.now()));
            sysUserDao.insert(sysUser);

            SysUserExample sysUserExample = new SysUserExample();
            sysUserExample.createCriteria().andUsernameEqualTo(sysUser.getUsername());
            SysUser newUser = sysUserDao.selectByExample(sysUserExample).get(0);

            // 插入用户角色关系
            for (Integer roleId : roles) {
                SysUserRole sysUserRole = new SysUserRole();
                sysUserRole.setUserId(newUser.getUserId());
                sysUserRole.setRoleId(Long.valueOf(roleId));
                sysUserRoleDao.insertSelective(sysUserRole);
            }
        } else {
            // 更新用户
            sysUserDao.updateByPrimaryKeySelective(sysUser);

            // 删除旧的用户角色关系
            SysUserRoleExample sysUserRoleExample = new SysUserRoleExample();
            sysUserRoleExample.createCriteria().andUserIdEqualTo(sysUser.getUserId());
            sysUserRoleDao.deleteByExample(sysUserRoleExample);

            // 插入新的用户角色关系
            for (Integer roleId : roles) {
                SysUserRole sysUserRole = new SysUserRole();
                sysUserRole.setUserId(sysUser.getUserId());
                sysUserRole.setRoleId(Long.valueOf(roleId));
                sysUserRoleDao.insertSelective(sysUserRole);
            }
        }
    }


    /**
     * 根据id删除用户
     * @param id 用户id
     */
    @Override
    public void deleteUserById(Integer id) {
        Long userId = Long.valueOf(id);

        // 删除用户角色关联
        SysUserRoleExample sysUserRoleExample = new SysUserRoleExample();
        sysUserRoleExample.createCriteria().andUserIdEqualTo(userId);
        sysUserRoleDao.deleteByExample(sysUserRoleExample);

        // 删除用户
        sysUserDao.deleteByPrimaryKey(userId);
    }


    @Override
    public PageInfo<SysUser> getAllUserByCondition(Integer pageNum, Integer pageSize, String name) {
        // 设置分页信息
        PageHelper.startPage(pageNum, pageSize);
        SysUserExample sysUserExample = new SysUserExample();
        if(!StrUtil.isEmpty(name)){
            sysUserExample.createCriteria().andUsernameLike("%"+name+"%");
        }
        List<SysUser> list = sysUserDao.selectByExample(sysUserExample);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

    @Override
    public void login(String userName, String passWord) {

//        sysUserDao.selectByExample();
    }

    @Override
    public void deleteBanch(List<String> ids) {
        for (String id : ids){
            deleteUserById(Integer.valueOf(id));
        }
    }
}
