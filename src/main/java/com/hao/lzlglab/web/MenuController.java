package com.hao.lzlglab.web;

import com.hao.lzlglab.entity.SysMenu;
import com.hao.lzlglab.service.MenuService;
import com.hao.lzlglab.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sys")
@PreAuthorize("hasAnyRole('超级管理员')")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("menuTree")
    public Result getMenuTree() {
        List<SysMenu> list = menuService.getMenuTree();
        return Result.success(list);
    }

    @GetMapping("/menu/by/parent")
    public Result getMenuByParent(String parentId) {
        List<SysMenu> list = menuService.getMenuByParent(parentId);
        return Result.success(list);
    }

    @PostMapping("/saveOrUpdate")
    public Result saveOrUpdate(@RequestBody SysMenu menu) {
        menuService.saveOrUpdate(menu);
        return Result.success();
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable String id) {
        menuService.delete(id);
        return Result.success();
    }





}
