package com.hao.lzlglab.dao;

import com.hao.lzlglab.entity.SmartEnv;
import com.hao.lzlglab.entity.SmartEnvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartEnvDao {
    long countByExample(SmartEnvExample example);

    int deleteByExample(SmartEnvExample example);

    int deleteByPrimaryKey(String id);

    int insert(SmartEnv record);

    int insertSelective(SmartEnv record);

    List<SmartEnv> selectByExample(SmartEnvExample example);

    SmartEnv selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SmartEnv record, @Param("example") SmartEnvExample example);

    int updateByExample(@Param("record") SmartEnv record, @Param("example") SmartEnvExample example);

    int updateByPrimaryKeySelective(SmartEnv record);

    int updateByPrimaryKey(SmartEnv record);
}