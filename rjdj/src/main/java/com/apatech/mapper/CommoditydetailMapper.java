package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Commodity;
import com.apatech.domain.Commoditydetail;

public interface CommoditydetailMapper {
    int deleteByPrimaryKey(String commoditydetailid);

    int insert(Commoditydetail record);

    int insertSelective(Commoditydetail record);

    Commoditydetail selectByPrimaryKey(String commoditydetailid);
    
    @Select("select * from Commoditydetail")
    List<Commoditydetail> selectAll();
    
    /**
     * 根据商品主表id查询
     * @return
     */
    @Select("SELECT * FROM commodity a\r\n" + 
    		"INNER JOIN commoditydetail d ON a.`productCodeID`=d.`productCodeID`\r\n" + 
    		"INNER JOIN color e ON d.`colorID`=e.`colorID`\r\n" + 
    		"INNER JOIN commoditysize f ON d.`commoditySizeID`=f.`commoditySizeID`\r\n" + 
    		"WHERE d.`productCodeID`=#{productcodeid}")
    List<Commodity> selectByid(String productcodeid);



    int updateByPrimaryKeySelective(Commoditydetail record);

    int updateByPrimaryKey(Commoditydetail record);
}