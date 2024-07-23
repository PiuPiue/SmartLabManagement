package com.hao.lzlglab.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaveOrUpdateRoleRequest {
    private Long roleId;
    private String roleName;
    private String remark;
    private List<String> menus;




}
