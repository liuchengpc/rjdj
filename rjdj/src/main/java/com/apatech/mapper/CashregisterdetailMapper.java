package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Cashregisterdetail;

public interface CashregisterdetailMapper {
    int deleteByPrimaryKey(String cashregisterid);

    int insert(Cashregisterdetail record);

    int insertSelective(Cashregisterdetail record);

    Cashregisterdetail selectByPrimaryKey(String cashregisterid);
    
    @Select("select * from Cashregisterdetail")
    List<Cashregisterdetail> selectAll();

    int updateByPrimaryKeySelective(Cashregisterdetail record);

    int updateByPrimaryKey(Cashregisterdetail record);
}