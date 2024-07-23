package com.hao.lzlglab.web;

import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.entity.SmartDevice;
import com.hao.lzlglab.entity.SmartDeviceType;
import com.hao.lzlglab.service.SmartDeviceService;
import com.hao.lzlglab.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/device")
@Api("设备管理模块")
public class SmartDeviceController {

    @Autowired
    private SmartDeviceService smartDeviceService;



    @GetMapping("/by/condition")
    @ApiOperation("分页查询设备信息")
    public Result getDeviceByCondition(Integer pageNum,Integer pageSize,String key,String typeId){
        PageInfo<SmartDevice> list = smartDeviceService.getDeviceByCondition(pageNum,pageSize,key,typeId);
        return Result.success(list);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation("新增或修改设备")
    public Result saveOrUpdate(@RequestBody SmartDevice smartDevice){
        smartDeviceService.saveOrUpdate(smartDevice);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result deleteDeviceById(@PathVariable String id){
        smartDeviceService.seleteDeviceById(id);
        return Result.success();
    }

    @PostMapping("/ids")
    @ApiOperation("批量删除设备")
    public Result deleteDevices(@RequestBody List<String> ids){
        smartDeviceService.deleteDevices(ids);
        return Result.success();
    }


}
