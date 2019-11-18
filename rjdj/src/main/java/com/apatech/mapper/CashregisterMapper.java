package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Cashregister;

public interface CashregisterMapper {
    int deleteByPrimaryKey(String ashregisterid);

    int insert(Cashregister record);

    int insertSelective(Cashregister record);

    Cashregister selectByPrimaryKey(String ashregisterid);
    
    @Select("select * from Cashregister")
    List<Cashregister> selectAll();

    int updateByPrimaryKeySelective(Cashregister record);

    int updateByPrimaryKey(Cashregister record);
}