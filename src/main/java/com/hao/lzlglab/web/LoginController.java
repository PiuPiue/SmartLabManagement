package com.hao.lzlglab.web;


import com.hao.lzlglab.service.UsersService;
import com.hao.lzlglab.utils.JwtUtils;
import com.hao.lzlglab.utils.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {



    @Autowired
    private UserDetailsService userDetailsService;


    @PostMapping("/login")
    @ApiOperation("登录")
    public Result login(String username, String password){
        userDetailsService.loadUserByUsername(username);
        return Result.success();
    }

}
