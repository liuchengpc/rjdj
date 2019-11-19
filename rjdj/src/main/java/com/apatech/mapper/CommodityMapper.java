package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Commodity;

public interface CommodityMapper {
    int deleteByPrimaryKey(String productcodeid);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(String productcodeid);
    
    @Select("select * from Commodity")
    List<Commodity> selectAll();
    
   
    List<Commodity> selectAll2(@Param("commoditytypeid")Integer commoditytypeid,@Param("selectqb")String selectqb);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
}