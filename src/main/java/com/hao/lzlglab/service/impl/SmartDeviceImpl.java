package com.hao.lzlglab.service.impl;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.dao.SmartDeviceDao;
import com.hao.lzlglab.dao.SmartDeviceTypeDao;
import com.hao.lzlglab.entity.*;
import com.hao.lzlglab.service.SmartDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartDeviceImpl implements SmartDeviceService {

    @Autowired
    private SmartDeviceDao smartDeviceDao;
    @Autowired
    private SmartDeviceTypeDao smartDeviceTypeDao;


    @Override
    public PageInfo<SmartDevice> getDeviceByCondition(Integer pageNum, Integer pageSize, String key, String typeId) {
        PageHelper.startPage(pageNum, pageSize);
        SmartDeviceExample smartDeviceExample = new SmartDeviceExample();
        SmartDeviceExample.Criteria criteria = smartDeviceExample.createCriteria();

        if (!StrUtil.isEmpty(key)) {
            criteria = criteria.andDeviceNameLike("%" + key + "%");
        }
        if (!StrUtil.isEmpty(typeId)) {
            criteria.andDeviceTypeEqualTo(typeId);
        }

        List<SmartDevice> smartDevices = smartDeviceDao.selectByExample(smartDeviceExample);
        return new PageInfo<>(smartDevices);
    }


    @Override
    public void saveOrUpdate(SmartDevice smartDevice) {
        //首先查询分类是否存在，不存在需要先新增该分类
        SmartDeviceTypeExample smartDeviceTypeExample = new SmartDeviceTypeExample();
        smartDeviceTypeExample.createCriteria().andTypeNameEqualTo(smartDevice.getDeviceType());
        List<SmartDeviceType> list = smartDeviceTypeDao.selectByExample(smartDeviceTypeExample);
        if(list.size()==0){
            //需要新增
            SmartDeviceType smartDeviceType = new SmartDeviceType();
            String snowflakeNextIdStr = IdUtil.getSnowflakeNextIdStr();
            smartDeviceType.setId(snowflakeNextIdStr);
            smartDeviceType.setTypeName(smartDevice.getDeviceType());
            smartDeviceTypeDao.insertSelective(smartDeviceType);
        }
        if(!StrUtil.isEmpty(smartDevice.getId())){
            smartDeviceDao.updateByPrimaryKeySelective(smartDevice);
        }else{
            String snowflakeNextIdStr = IdUtil.getSnowflakeNextIdStr();
            smartDevice.setId(snowflakeNextIdStr);


            smartDeviceDao.insert(smartDevice);
        }
    }

    @Override
    public void seleteDeviceById(String id) {
        smartDeviceDao.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteDevices(List<String> ids) {
        for(String id:ids){
            smartDeviceDao.deleteByPrimaryKey(id);
        }
    }
}
