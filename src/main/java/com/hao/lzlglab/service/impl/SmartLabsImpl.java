package com.hao.lzlglab.service.impl;

import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import com.hao.lzlglab.dao.SmartLabsDao;
import com.hao.lzlglab.entity.SmartLabs;
import com.hao.lzlglab.entity.SmartLabsExample;
import com.hao.lzlglab.service.SmartLabsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartLabsImpl implements SmartLabsService {

    @Autowired
    private SmartLabsDao smartLabsDao;

    @Override
    public List<SmartLabs> findAllSmartLabs() {
        return smartLabsDao.selectByExample(new SmartLabsExample());
    }

    @Override
    public void saveOrUpdate(SmartLabs smartLabs) {
        //根据某个条件判断  空字符串
        if(StrUtil.isEmpty(smartLabs.getId())){
            //符合条件(不存在id) 新增
            String snowflakeNextIdStr = IdUtil.getSnowflakeNextIdStr();
            smartLabs.setId(snowflakeNextIdStr);
            smartLabsDao.insert(smartLabs);

        }else{
            //不符合条件(存在id) 修改
            smartLabsDao.updateByPrimaryKeySelective(smartLabs);
        }
    }
}
