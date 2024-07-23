package com.hao.lzlglab.service;

import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.entity.SmartDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SmartDeviceService {
    PageInfo<SmartDevice> getDeviceByCondition(Integer pageNum, Integer pageSize, String key, String typeId);

    void saveOrUpdate(SmartDevice smartDevice);

    void seleteDeviceById(String id);

    void deleteDevices(List<String> ids);
}
