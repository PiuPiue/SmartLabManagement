package com.hao.lzlglab.web;


import com.hao.lzlglab.service.UsersService;
import com.hao.lzlglab.utils.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/login")
    @ApiOperation("登录")
    public Result login(String userName,String passWord,String formId){
        usersService.login(userName,passWord);
        String token = "11111";
        return Result.success(token);
    }

}
