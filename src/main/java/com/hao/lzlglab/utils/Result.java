package com.hao.lzlglab.utils;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

/**
 * 自定义统一的结果响应
 */
@Data
public class Result<T> {
    private Integer code;
    private String message;
    private T data;
    private long timestamp;


    //响应成功不带数据
    public static Result success(){
        return success(null);
    }
    //响应成功携带数据
    public static <T>Result<T> success(T data){
        Result<T> result = new Result<>();
        result.setCode(200);
        result.setMessage("ok");
        result.setTimestamp(System.currentTimeMillis());
        result.setData(data);
        return result;
    }
    //响应失败 统一的标准
    public static Result error(){
        return error(ResultCode.FAILURE);
    }

    public static Result error(int code,String message){
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        result.setTimestamp(System.currentTimeMillis());
        return result;
    }

    //响应失败，使用枚举中定义的方法
    public static Result error(ResultCode resultCode){
        return error(resultCode,null);
    }

    //响应失败 携带信息(自定义)
    public static <T>Result<T> error(ResultCode resultCode,T data){
        Result<T> result = new Result<>();
        result.setCode(resultCode.getCode());
        result.setMessage(resultCode.getMessage());
        result.setTimestamp(System.currentTimeMillis());
        result.setData(data);
        return result;
    }



}
