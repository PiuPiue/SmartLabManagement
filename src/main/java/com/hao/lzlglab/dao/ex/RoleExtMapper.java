package com.hao.lzlglab.dao.ex;

import com.hao.lzlglab.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleExtMapper {

    List<SysRole> selectRolesByUserId(String userId);

}
