package com.hao.lzlglab.service.impl;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.dao.SysUserDao;
import com.hao.lzlglab.entity.SysUser;
import com.hao.lzlglab.entity.SysUserExample;
import com.hao.lzlglab.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class UsersImpl implements UsersService {

    @Autowired
    SysUserDao sysUserDao;

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
     * @param sysUser
     */
    @Override
    public void saveOrUpdate(SysUser sysUser) {
        if(sysUser.getUserId()==null){
            //如果userId为空，则证明是新增
                //首先查询是否存在createdUserId
            sysUserDao.insert(sysUser);
        }else{
            //如果id存在，则证明是修改
            sysUserDao.updateByPrimaryKeySelective(sysUser);
        }
    }

    /**
     * 根据id删除用户
     * @param id 用户id
     */
    @Override
    public void deleteUserById(Integer id) {
        sysUserDao.deleteByPrimaryKey(Long.valueOf(id));
    }

    @Override
    public PageInfo<SysUser> getAllUserByCondition(Integer pageNum, Integer pageSize) {
        // 设置分页信息
        PageHelper.startPage(pageNum, pageSize);
        SysUserExample sysUserExample = new SysUserExample();
        List<SysUser> list = sysUserDao.selectByExample(sysUserExample);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

    @Override
    public void login(String userName, String passWord) {

//        sysUserDao.selectByExample();
    }
}
