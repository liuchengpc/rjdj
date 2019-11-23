package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Users;

public interface UsersMapper {
	int deleteUser(String userid);
	
	Users queryByUserIDBykey(String userid);
	
	int insertUser(Users user);
	
	int queryUserByCount(String userid);
	
	List<Users> queryByUserPage(Users user);
	
    int deleteByPrimaryKey(String userid);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(String userid);
    
    @Select("select * from Users")
    List<Users> selectAll();

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}