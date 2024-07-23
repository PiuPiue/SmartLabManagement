package com.hao.lzlglab.dao;

import com.hao.lzlglab.entity.SmartDeviceType;
import com.hao.lzlglab.entity.SmartDeviceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartDeviceTypeDao {
    long countByExample(SmartDeviceTypeExample example);

    int deleteByExample(SmartDeviceTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(SmartDeviceType record);

    int insertSelective(SmartDeviceType record);

    List<SmartDeviceType> selectByExample(SmartDeviceTypeExample example);

    SmartDeviceType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SmartDeviceType record, @Param("example") SmartDeviceTypeExample example);

    int updateByExample(@Param("record") SmartDeviceType record, @Param("example") SmartDeviceTypeExample example);

    int updateByPrimaryKeySelective(SmartDeviceType record);

    int updateByPrimaryKey(SmartDeviceType record);
}