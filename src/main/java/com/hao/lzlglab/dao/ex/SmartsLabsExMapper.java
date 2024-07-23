package com.hao.lzlglab.dao.ex;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 *  SmartsLabs的拓展
 *  主要是一些动态sql,或者多表查询,子查询等
 */

public interface SmartsLabsExMapper {

    void deleteBatch(@Param("ids")List<String>ids);

}
