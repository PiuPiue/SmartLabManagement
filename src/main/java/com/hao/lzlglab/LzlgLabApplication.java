package com.hao.lzlglab;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//接口扫描
@MapperScan("com.hao.lzlglab.dao")
public class LzlgLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(LzlgLabApplication.class, args);
    }

}
