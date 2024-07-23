package com.hao.lzlglab.web;

import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.entity.SysUser;
import com.hao.lzlglab.entity.SysUserRequest;
import com.hao.lzlglab.service.UsersService;
import com.hao.lzlglab.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Api("用户管理")
@PreAuthorize("hasAnyRole('超级管理员')")
public class UserController {

    @Autowired
    private UsersService usersService;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/allUser")
    @ApiOperation("查询所有用户")
    public Result getAllUser(){
        List<SysUser> list = usersService.getAllUser();
        return Result.success(list);
    }

    /**
     * 分页查询用户信息
     * @param pageNum 页数
     * @param pageSize 每页数量
     * @return
     */
    @GetMapping("/all")
    @ApiOperation("分页查询用户")
    public Result getAllUserByCondition(Integer pageNum,Integer pageSize,String name){
        PageInfo<SysUser> list = usersService.getAllUserByCondition(pageNum,pageSize,name);
        return Result.success(list);
    }

    /**
     * 新增或修改用户
     * @param sysUser 要新增或修改的用户信息
     * @return
     */
    @ApiOperation("新增或修改用户")
    @PostMapping("/saveOrUpdate")
    public Result saveOrUpdate(@RequestBody SysUserRequest sysUser){
        SysUser sysUser1 = new SysUser();
        sysUser1.setUserId(sysUser.getUserId());
        sysUser1.setUsername(sysUser.getUsername());
        sysUser1.setPassword(sysUser.getPassword());
        sysUser1.setRealname(sysUser.getRealname());
        sysUser1.setEmail(sysUser.getEmail());
        sysUser1.setMobile(sysUser.getMobile());
        sysUser1.setStatus(sysUser.getStatus());
        sysUser1.setCreateUserId(sysUser.getCreateUserId());
        usersService.saveOrUpdate(sysUser1,sysUser.getRoles());
        return Result.success();
    }

    @ApiOperation("根据用户id进行删除")
    @DeleteMapping("/{id}")
    public Result deleteUserById(@PathVariable Integer id){
        usersService.deleteUserById(id);
        return Result.success();
    }

    @PostMapping("/deleteBanch")
    public Result deleteBanch(@RequestBody List<String> ids){
        usersService.deleteBanch(ids);
        return Result.success();
    }




}
