package com.hao.lzlglab.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.dao.SysLogDao;
import com.hao.lzlglab.entity.SysLog;
import com.hao.lzlglab.entity.SysLogExample;
import com.hao.lzlglab.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class LogImpl implements LogService {

    @Autowired
    SysLogDao sysLogDao;

    @Override
    public PageInfo<SysLog> getAllLog(String pageNum, String pageSize, String key, Date begin, Date end) {

        PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        SysLogExample sysLogExample = new SysLogExample();
        SysLogExample.Criteria criteria = sysLogExample.createCriteria();
        if(key != null){
            criteria = criteria.andUsernameLike("%" + key + "%");
        }
        if(begin != null){
            criteria = criteria.andCreateDateGreaterThanOrEqualTo(begin);
        }
        if(end != null){
            criteria.andCreateDateLessThanOrEqualTo(end);
        }
        List<SysLog> sysLogs = sysLogDao.selectByExample(sysLogExample);
        return new PageInfo<>(sysLogs);
    }
}
