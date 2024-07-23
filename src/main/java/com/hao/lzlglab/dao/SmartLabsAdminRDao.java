package com.hao.lzlglab.dao;

import com.hao.lzlglab.entity.SmartLabsAdminR;
import com.hao.lzlglab.entity.SmartLabsAdminRExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartLabsAdminRDao {
    long countByExample(SmartLabsAdminRExample example);

    int deleteByExample(SmartLabsAdminRExample example);

    int deleteByPrimaryKey(String id);

    int insert(SmartLabsAdminR record);

    int insertSelective(SmartLabsAdminR record);

    List<SmartLabsAdminR> selectByExample(SmartLabsAdminRExample example);

    SmartLabsAdminR selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SmartLabsAdminR record, @Param("example") SmartLabsAdminRExample example);

    int updateByExample(@Param("record") SmartLabsAdminR record, @Param("example") SmartLabsAdminRExample example);

    int updateByPrimaryKeySelective(SmartLabsAdminR record);

    int updateByPrimaryKey(SmartLabsAdminR record);
}