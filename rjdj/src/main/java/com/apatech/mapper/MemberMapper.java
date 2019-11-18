package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Member;

public interface MemberMapper {
    int deleteByPrimaryKey(Integer memberid);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Integer memberid);
    
    @Select("select * from Member")
    List<Member> selectAll();

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}