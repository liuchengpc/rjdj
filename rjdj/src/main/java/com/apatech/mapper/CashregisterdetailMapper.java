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
    @Select("SELECT  * FROM cashregisterdetail a\r\n" + 
    		"INNER JOIN cashregister b ON a.cashRegisterID=b.ashRegisterID\r\n" + 
    		"INNER JOIN commoditydetail c ON a.commodityDetailID=c.commodityDetailID\r\n" + 
    		"INNER JOIN commoditydetail d ON  a.commodityDetailID=d.commodityDetailID\r\n" + 
    		"INNER JOIN commodity e ON e.productCodeID=d.productCodeID\r\n"+ 
    		"INNER JOIN color f ON f.colorID =d.colorID\r\n" + 
    		"INNER JOIN commoditysize g ON g.commoditySizeID=d.commoditySizeID " + 
    		"WHERE a.cashRegisterID=#{cashregisterid}")
    List<Cashregisterdetail> selectByid(String cashregisterid);
    
    @Select("select * from Cashregisterdetail")
    List<Cashregisterdetail> selectAll();

    int updateByPrimaryKeySelective(Cashregisterdetail record);

    int updateByPrimaryKey(Cashregisterdetail record);
}