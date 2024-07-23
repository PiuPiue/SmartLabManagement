package com.hao.lzlglab.service;

import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.entity.SysLog;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public interface LogService {

    PageInfo<SysLog> getAllLog(String pageNum, String pageSize, String key, Date begin, Date end);




}
