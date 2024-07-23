package com.hao.lzlglab.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUserRequest {
    private Long userId;

    private String username;

    private String realname;

    private String password;

    private String email;

    private String mobile;

    /**
     * 状态  0：禁用   1：正常
     */
    private Byte status;

    /**
     * 创建者ID
     */
    private Long createUserId;

    private Date createTime;
    private List<Integer> roles;
}
