package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Roleprivilege;

public interface RoleprivilegeMapper {
    int deleteByPrimaryKey(Integer roleprivilegeid);

    int insert(Roleprivilege record);

    int insertSelective(Roleprivilege record);

    Roleprivilege selectByPrimaryKey(Integer roleprivilegeid);
    
    @Select("select * from Roleprivilege")
    List<Roleprivilege> selectAll();

    int updateByPrimaryKeySelective(Roleprivilege record);

    int updateByPrimaryKey(Roleprivilege record);
}