package com.hao.lzlglab.web;
import com.hao.lzlglab.entity.SmartLabs;
import com.hao.lzlglab.service.SmartLabsService;
import com.hao.lzlglab.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
     * 根据条件查询实验室
     * @return
     */
    @GetMapping("/by/condition")
    @ApiOperation(value = "根据条件查询实验室信息",notes = "根据条件查询实验室")
    public Result findLabsByCondition(){
        return Result.success();
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

}
