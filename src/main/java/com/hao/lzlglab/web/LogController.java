package com.hao.lzlglab.web;

import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.entity.SysLog;
import com.hao.lzlglab.service.LogService;
import com.hao.lzlglab.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/syslog")
@PreAuthorize("hasAnyRole('超级管理员')")
public class LogController {

    @Autowired
    private LogService logService;

    @GetMapping("/by/condition")
    public Result getAllLog(String pageNum, String pageSize, String key,@DateTimeFormat(pattern = "yyyy-MM-dd") Date begin,
                            @DateTimeFormat(pattern = "yyyy-MM-dd")Date end){
        PageInfo<SysLog> list = logService.getAllLog(pageNum,pageSize,key,begin,end);
        return Result.success(list);
    }

}
