package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Detail;

public interface DetailMapper {
    int deleteByPrimaryKey(Integer detailid);

    int insert(Detail record);

    int insertSelective(Detail record);

    Detail selectByPrimaryKey(Integer detailid);
    
    @Select("select * from Detail")
    List<Detail> selectAll();

    int updateByPrimaryKeySelective(Detail record);

    int updateByPrimaryKey(Detail record);
}