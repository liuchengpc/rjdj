package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer roleid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer roleid);
    
    @Select("select * from Role")
    List<Role> selectAll();

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}