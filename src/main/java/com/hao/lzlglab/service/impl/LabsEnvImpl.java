package com.hao.lzlglab.service.impl;

import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.dao.SmartEnvDao;
import com.hao.lzlglab.dao.SmartEnvDetailDao;
import com.hao.lzlglab.entity.SmartEnv;
import com.hao.lzlglab.entity.SmartEnvDetail;
import com.hao.lzlglab.entity.SmartEnvDetailExample;
import com.hao.lzlglab.entity.SmartEnvExample;
import com.hao.lzlglab.service.LabsEnvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.zip.CRC32;

@Service
public class LabsEnvImpl implements LabsEnvService {

    @Autowired
    private SmartEnvDao smartEnvDao;
    @Autowired
    private SmartEnvDetailDao smartEnvDetailDao;

    @Override
    public PageInfo<SmartEnv> getEnv(String type, Date begin, Date end, String pageNum, String pageSize) {
        PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        SmartEnvExample example = new SmartEnvExample();
        SmartEnvExample.Criteria  criteria = example.createCriteria();

        if(begin!=null&&end!= null) {
            criteria = criteria.andGatherDateBetween(begin,end);
        }
        if(!StrUtil.isEmpty(type)){
             criteria = criteria.andTypeEqualTo(Integer.parseInt(type));
        }
        List<SmartEnv> smartEnvs = smartEnvDao.selectByExample(example);
        return new PageInfo<>(smartEnvs);
    }

    @Override
    public List<SmartEnvDetail> getStatisticByMonth(Date date) {
        SmartEnvDetailExample example = new SmartEnvDetailExample();
        // 计算当月的第一天
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date firstDayOfMonth = cal.getTime();

        // 计算当月的最后一天
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        Date lastDayOfMonth = cal.getTime();

        // 使用计算出的日期范围修改查询条件
        example.createCriteria().andGatherDateBetween(firstDayOfMonth, lastDayOfMonth);
        List<SmartEnvDetail> smartEnvs = smartEnvDetailDao.selectByExample(example);
        return smartEnvs;
    }
}
