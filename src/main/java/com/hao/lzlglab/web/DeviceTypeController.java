package com.hao.lzlglab.web;

import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.entity.SmartDeviceType;
import com.hao.lzlglab.service.DeviceTypeService;
import com.hao.lzlglab.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deviceType")
@Api("设备分类控制")
public class DeviceTypeController {

    @Autowired
    private DeviceTypeService deviceTypeService;

    @GetMapping("/all")
    @ApiOperation("查询所有设备分类信息")
    public Result getAllDeviceType(){
        List<SmartDeviceType> list =  deviceTypeService.getAllDeviceType();
        return Result.success(list);
    }

    @GetMapping("/query")
    @ApiOperation("分页查询设备分类信息")
    public Result getDeviceTypeByCondition(Integer pageNum,Integer pageSize,String key,String typeId){
        PageInfo<SmartDeviceType> list = deviceTypeService.getDeviceTypeByCondition(pageNum,pageSize,key,typeId);
        return Result.success(list);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation("修改或新增设备分类信息")
    public Result saveOrUpdateType(@RequestBody SmartDeviceType smartDeviceType){
        deviceTypeService.saveOrUpdateType(smartDeviceType);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation("根据id删除分类信息")
    public Result deleteTypeById(@PathVariable String id){
        deviceTypeService.deleteTypeById(id);
        return Result.success();
    }


}
