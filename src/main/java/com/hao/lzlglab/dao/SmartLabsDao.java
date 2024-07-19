package com.hao.lzlglab.dao;

import com.hao.lzlglab.entity.SmartLabs;
import com.hao.lzlglab.entity.SmartLabsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartLabsDao {
    long countByExample(SmartLabsExample example);

    int deleteByExample(SmartLabsExample example);

    int deleteByPrimaryKey(String id);

    int insert(SmartLabs record);

    int insertSelective(SmartLabs record);

    List<SmartLabs> selectByExample(SmartLabsExample example);

    SmartLabs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SmartLabs record, @Param("example") SmartLabsExample example);

    int updateByExample(@Param("record") SmartLabs record, @Param("example") SmartLabsExample example);

    int updateByPrimaryKeySelective(SmartLabs record);

    int updateByPrimaryKey(SmartLabs record);
}