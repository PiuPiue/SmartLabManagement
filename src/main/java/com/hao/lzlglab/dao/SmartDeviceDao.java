package com.hao.lzlglab.dao;

import com.hao.lzlglab.entity.SmartDevice;
import com.hao.lzlglab.entity.SmartDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartDeviceDao {
    long countByExample(SmartDeviceExample example);

    int deleteByExample(SmartDeviceExample example);

    int deleteByPrimaryKey(String id);

    int insert(SmartDevice record);

    int insertSelective(SmartDevice record);

    List<SmartDevice> selectByExample(SmartDeviceExample example);

    SmartDevice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SmartDevice record, @Param("example") SmartDeviceExample example);

    int updateByExample(@Param("record") SmartDevice record, @Param("example") SmartDeviceExample example);

    int updateByPrimaryKeySelective(SmartDevice record);

    int updateByPrimaryKey(SmartDevice record);
}