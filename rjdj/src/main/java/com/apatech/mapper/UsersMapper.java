package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(String userid);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(String userid);
    
    @Select("select * from Users")
    List<Users> selectAll();

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}