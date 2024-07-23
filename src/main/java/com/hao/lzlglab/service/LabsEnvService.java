package com.hao.lzlglab.service;

import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.entity.SmartEnv;
import com.hao.lzlglab.entity.SmartEnvDetail;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface LabsEnvService {

    PageInfo<SmartEnv> getEnv(String type, Date begin, Date end, String pageNum, String pageSize);

    List<SmartEnvDetail> getStatisticByMonth(Date date);
}
