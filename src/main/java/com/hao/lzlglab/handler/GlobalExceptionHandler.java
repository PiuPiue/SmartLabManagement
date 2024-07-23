package com.hao.lzlglab.handler;



import com.hao.lzlglab.utils.LabSystemException;
import com.hao.lzlglab.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler
    public Result exceptionHandler(Exception e){
        e.printStackTrace();
        if (e instanceof LabSystemException){
            LabSystemException bse= (LabSystemException) e;
            log.error("出现了异常！！！",e);
            return Result.error(bse.getCode(),bse.getMessage());
        }else if(e instanceof AccessDeniedException){
            return Result.error(590,"权限不足,请联系管理员进行授权");
        }
        else {
            log.error("出现了异常！！！",e);
            return Result.error();
        }

    }
}
