package com.hao.lzlglab.service.impl;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.dao.SmartDeviceDao;
import com.hao.lzlglab.dao.SmartDeviceTypeDao;
import com.hao.lzlglab.entity.*;
import com.hao.lzlglab.service.DeviceTypeService;
import com.hao.lzlglab.utils.LabSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceTypeImpl implements DeviceTypeService {

    @Autowired
    private SmartDeviceTypeDao smartDeviceTypeDao;
    @Autowired
    private SmartDeviceDao smartDeviceDao;

    @Override
    public List<SmartDeviceType> getAllDeviceType() {
        SmartDeviceTypeExample smartDeviceTypeExample = new SmartDeviceTypeExample();
        return smartDeviceTypeDao.selectByExample(smartDeviceTypeExample);
    }

    @Override
    public PageInfo<SmartDeviceType> getDeviceTypeByCondition(Integer pageNum, Integer pageSize, String key, String typeId) {
        PageHelper.startPage(pageNum, pageSize);
        SmartDeviceTypeExample smartDeviceTypeExample = new SmartDeviceTypeExample();
        SmartDeviceTypeExample.Criteria criteria = smartDeviceTypeExample.createCriteria();

        if (!StrUtil.isEmpty(key)) {
            criteria = criteria.andTypeNameLike("%" + key + "%");
        }
        if (!StrUtil.isEmpty(typeId)) {
            criteria.andIdEqualTo(typeId);
        }

        List<SmartDeviceType> list = smartDeviceTypeDao.selectByExample(smartDeviceTypeExample);
        return new PageInfo<>(list);
    }


    @Override
    public void saveOrUpdateType(SmartDeviceType smartDeviceType) {
        if(!StrUtil.isEmpty(smartDeviceType.getId())){
            smartDeviceTypeDao.updateByPrimaryKeySelective(smartDeviceType);
        }else{
            String snowflakeNextIdStr = IdUtil.getSnowflakeNextIdStr();
            smartDeviceType.setId(snowflakeNextIdStr);
            smartDeviceTypeDao.insertSelective(smartDeviceType);
        }
    }

    @Override
    public void deleteTypeById(String id) {
        //删除前先查询是否会有外表关联
        SmartDeviceExample smartDeviceExample = new SmartDeviceExample();
        smartDeviceExample.createCriteria().andDeviceTypeEqualTo(String.valueOf(id));
        List<SmartDevice> smartDevices = smartDeviceDao.selectByExample(smartDeviceExample);
        if(smartDevices.size()!=0){
            throw new LabSystemException(LabSystemException.CodeMsgEnum.TYPE_ID_IS_USING);
        }
        smartDeviceTypeDao.deleteByPrimaryKey(String.valueOf(id));
    }
}
