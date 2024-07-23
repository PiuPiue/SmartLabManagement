package com.hao.lzlglab.utils;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * 返回响应码
 */

@Getter
@AllArgsConstructor
public enum ResultCode {
    SUCCESS(1,"请求成功"),
    FAILURE(0,"请求失败,原因未知,请到后台查询日志"),
    USERNAME_EXIST(1001,"用户名已存在"),
    LOGIN_DEFINED(1002,"登录失败"),
    DATA_NOT_EXIST(2002,"数据不存在");


    private Integer code;
    private String message;


}
