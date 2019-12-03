package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Recharge;

public interface RechargeMapper {
    int deleteByPrimaryKey(Integer rechargeid);

    int insert(Recharge record);

    int insertSelective(Recharge record);

    Recharge selectByPrimaryKey(Integer rechargeid);
    
    @Select("select * from Recharge")
    List<Recharge> selectAll();
    
    @Select("select * from Recharge where memberid=#{memberid}")
    List<Recharge> selectByid(Integer memberid);

    int updateByPrimaryKeySelective(Recharge record);

    int updateByPrimaryKey(Recharge record);
}