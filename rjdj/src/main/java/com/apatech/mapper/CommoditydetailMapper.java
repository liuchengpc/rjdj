package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Commoditydetail;

public interface CommoditydetailMapper {
    int deleteByPrimaryKey(String commoditydetailid);

    int insert(Commoditydetail record);

    int insertSelective(Commoditydetail record);

    Commoditydetail selectByPrimaryKey(String commoditydetailid);
    
    @Select("select * from Commoditydetail")
    List<Commoditydetail> selectAll();

    int updateByPrimaryKeySelective(Commoditydetail record);

    int updateByPrimaryKey(Commoditydetail record);
}