package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Cashregisterdetail;
import com.apatech.domain.Detail;

public interface CashregisterdetailMapper {
    int deleteByPrimaryKey(Integer cashregisterdetailid);

    int insert(Cashregisterdetail record);

    int insertSelective(Cashregisterdetail record);

    Cashregisterdetail selectByPrimaryKey(Integer cashregisterdetailid);
    
    /**
     * 根据商品主表id查询
     * @return
     */
    @Select("SELECT * FROM supplier b \r\n" + 
    		"INNER JOIN bill e ON e.supplierID=b.supplierID\r\n" + 
    		"INNER JOIN users h ON h.userID=e.userID\r\n" + 
    		"INNER JOIN detail f ON f.billID=e.billID\r\n" + 
    		"INNER JOIN commoditydetail g ON g.commodityDetailID=f.commodityDetailID\r\n" + 
    		"WHERE f.billID=#{billid}")
    List<Detail> selectByid(String billid);
    
    @Select("select * from Cashregisterdetail")
    List<Cashregisterdetail> selectAll();

    int updateByPrimaryKeySelective(Cashregisterdetail record);

    int updateByPrimaryKey(Cashregisterdetail record);
}