package com.hao.lzlglab.dao.ex;

import com.hao.lzlglab.entity.SysMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuExtMapper {

    List<SysMenu> getMenuByRoleId(String roleId);

}
