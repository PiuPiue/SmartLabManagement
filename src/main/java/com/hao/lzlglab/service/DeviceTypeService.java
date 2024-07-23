package com.hao.lzlglab.service;

import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.entity.SmartDeviceType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeviceTypeService {

    List<SmartDeviceType> getAllDeviceType();

    PageInfo<SmartDeviceType> getDeviceTypeByCondition(Integer pageNum, Integer pageSize, String key, String typeId);

    void saveOrUpdateType(SmartDeviceType smartDeviceType);

    void deleteTypeById(String id);
}
