package com.hao.lzlglab.dao;

import com.hao.lzlglab.entity.SysUserRole;
import com.hao.lzlglab.entity.SysUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRoleDao {
    long countByExample(SysUserRoleExample example);

    int deleteByExample(SysUserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    List<SysUserRole> selectByExample(SysUserRoleExample example);

    SysUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUserRole record, @Param("example") SysUserRoleExample example);

    int updateByExample(@Param("record") SysUserRole record, @Param("example") SysUserRoleExample example);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}