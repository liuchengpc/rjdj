package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Roleprivilege;

public interface RoleprivilegeMapper {
	int deleteRoleAndPrivilege(Integer roleid);
	
	List<Roleprivilege> queryPrivilegeByRoleID(Integer roleid);
	
	int insertRoleprivilege(Roleprivilege r);
	
    int deleteByPrimaryKey(Integer roleprivilegeid);

    int insert(Roleprivilege record);

    int insertSelective(Roleprivilege record);

    Roleprivilege selectByPrimaryKey(Integer roleprivilegeid);
    

    List<Roleprivilege> selectByroleid(Integer roleid);
    
    @Select("select * from Roleprivilege")
    List<Roleprivilege> selectAll();

    int updateByPrimaryKeySelective(Roleprivilege record);

    int updateByPrimaryKey(Roleprivilege record);
}