package com.hao.lzlglab.web;
import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.entity.SmartLabs;
import com.hao.lzlglab.entity.SmartLabsAdminR;
import com.hao.lzlglab.service.SmartLabsService;
import com.hao.lzlglab.service.UsersService;
import com.hao.lzlglab.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.LinkOption;
import java.util.List;

@RestController
@RequestMapping("/labs")
@Api("实验室管理")
public class SmartLabsController {

    @Autowired
    private SmartLabsService service;
    /**
     * 查询所有实验室
     * @return
     */
    @GetMapping("/all")
    @ApiOperation(value = "获取所有实验室信息",notes = "获取所有实验室信息")
    public Result findAllSmartLabs(){
        List<SmartLabs> allSmartLabs = service.findAllSmartLabs();
        return Result.success(allSmartLabs);
    }

    /**
     * 新增或更新数据
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "增加或修改实验室实验室",notes = "增加或修改实验实验室")
    public Result saveOrUpdateLabs(@RequestBody SmartLabs smartLabs){
        service.saveOrUpdate(smartLabs);
        return Result.success();
    }

    /**
     * 根据id删除实验室
     * @param id 实验室id
     * @return
     */
    @DeleteMapping("/{id}")
    @ApiOperation("根据实验室id删除实验室")
    public Result deleteLabById(@PathVariable String id){
        service.deleteLabById(id);
        return Result.success();
    }

    /**
     * 批量删除实验室
     * @param ids 实验室id集合
     * @return
     */
    @PostMapping("/ids")
    @ApiOperation("根据ids批量删除")
    public Result deleteByIds(@RequestBody List<String>ids){
        service.deleteLabsByIds(ids);
        return Result.success();
    }

    /**
     * 分页查询实验室
     * @return
     */
    @GetMapping("/by/condition")
    @ApiOperation("分页查询实验室信息")
    public Result getLabsByCondition(Integer pageNum,Integer pageSize,String key,String typeId){
        PageInfo<SmartLabs> list = service.getLabsByCondition(pageNum,pageSize,key,typeId);
        return Result.success(list);
    }

    @PostMapping("/saveOrUpdateLabsAndUser")
    @ApiOperation("新增或修改实验室管理者")
    public Result saveOrUpdateLabsAndUser(@RequestBody SmartLabsAdminR smartLabsAdminR){
        service.saveOrUpdateLabsAndUser(smartLabsAdminR);
        return Result.success();
    }



}
