package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Shop;

public interface ShopMapper {
	int queryByCount(String shopid);
	
	List<Shop> queryByShopPage(Shop shop);
	
    int deleteByPrimaryKey(String shopid);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(String shopid);
    
    @Select("select * from Shop")
    List<Shop> selectAll();

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}