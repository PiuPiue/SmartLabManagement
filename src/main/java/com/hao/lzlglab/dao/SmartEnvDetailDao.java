package com.hao.lzlglab.dao;

import com.hao.lzlglab.entity.SmartEnvDetail;
import com.hao.lzlglab.entity.SmartEnvDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartEnvDetailDao {
    long countByExample(SmartEnvDetailExample example);

    int deleteByExample(SmartEnvDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmartEnvDetail record);

    int insertSelective(SmartEnvDetail record);

    List<SmartEnvDetail> selectByExample(SmartEnvDetailExample example);

    SmartEnvDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmartEnvDetail record, @Param("example") SmartEnvDetailExample example);

    int updateByExample(@Param("record") SmartEnvDetail record, @Param("example") SmartEnvDetailExample example);

    int updateByPrimaryKeySelective(SmartEnvDetail record);

    int updateByPrimaryKey(SmartEnvDetail record);
}