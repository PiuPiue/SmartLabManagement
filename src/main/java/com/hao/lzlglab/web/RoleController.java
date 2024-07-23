package com.hao.lzlglab.web;

import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.entity.SaveOrUpdateRoleRequest;
import com.hao.lzlglab.entity.SysRole;
import com.hao.lzlglab.service.RoleService;
import com.hao.lzlglab.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
@Api("角色管理")
public class RoleController {

    @Autowired
    private RoleService roleService;



    @GetMapping("/all")
    @ApiOperation("查询所有角色")
    public Result getAllRole(){
        List<SysRole> list = roleService.getAllRole();
        return Result.success(list);
    }

    @GetMapping("/by/condition")
    @ApiOperation("分页查询角色信息")
    public Result getLabsByCondition(Integer pageNum,Integer pageSize,String key){
        PageInfo<SysRole> list = roleService.getAllRoleByCondition(pageNum,pageSize,key);
        return Result.success(list);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation("查询或新增角色")
    public Result saveOrUpdateRole(@RequestBody SaveOrUpdateRoleRequest roleDto){
        SysRole sysRole = new SysRole();
        sysRole.setRoleId(roleDto.getRoleId());
        sysRole.setRoleName(roleDto.getRoleName());
        sysRole.setRemark(roleDto.getRemark());
        List<String> menus = roleDto.getMenus();
        roleService.saveOrUpdateRole(sysRole, menus);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation("根据id删除角色")
    public Result deleteRoleById(@PathVariable Integer id){
        roleService.deleteById(id);
        return Result.success();
    }


}
