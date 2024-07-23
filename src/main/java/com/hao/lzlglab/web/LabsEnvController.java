package com.hao.lzlglab.web;

import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.entity.SmartEnv;
import com.hao.lzlglab.service.LabsEnvService;
import com.hao.lzlglab.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/env")
public class LabsEnvController {

    @Autowired
    private LabsEnvService labsEnvService;

    @RequestMapping("/detail/by/condition")
    public Result getEnv(String type,
                         @DateTimeFormat(pattern = "yyyy-MM-dd ") Date begin,
                         @DateTimeFormat(pattern = "yyyy-MM-dd ") Date end,
                         String pageNum,
                         String pageSize) {
        PageInfo<SmartEnv> list = labsEnvService.getEnv( type, begin, end,pageNum,pageSize);
        return Result.success(list);
    }

    @GetMapping("/statistic/by/month")
    public Result getStatisticByMonth(@DateTimeFormat(pattern = "yyyy-MM") Date date) {
        return Result.success(labsEnvService.getStatisticByMonth(date));
    }

    @GetMapping("/statistic/by/year")
    public Result getStatisticByYear(@DateTimeFormat(pattern = "yyyy") Date year) {
        return Result.success(labsEnvService.getStatisticByYear(year));
    }



}
