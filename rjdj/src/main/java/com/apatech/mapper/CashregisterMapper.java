package com.apatech.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Cashregister;
import com.apatech.domain.Commodity;

public interface CashregisterMapper {
    int deleteByPrimaryKey(String ashregisterid);

    int insert(Cashregister record);

    int insertSelective(Cashregister record);

    Cashregister selectByPrimaryKey(String ashregisterid);
    
    @Select("select * from Cashregister")
    List<Cashregister> selectAll();
    
    /**
     * 多条件查询
     * @param PhoneOrName
     * @param startTime
     * @param endTime
     * @return
     */
    List<Cashregister> selectByAll(
    		@Param("PhoneOrName")String PhoneOrName,//姓名或者电话号码
    		@Param("startTime")Date startTime,//开始时间
    		@Param("endTime")Date endTime//结束时间
	);
    
    List<Commodity> selectAll3(
    		@Param("shopid")Integer shopid,//店铺
    		@Param("oldtime")Date oldtime,//开始时间
    		@Param("newtime")Date newtime,//结束时间
    		@Param("selectqb")String selectqb//查找
	);
    

    int updateByPrimaryKeySelective(Cashregister record);

    int updateByPrimaryKey(Cashregister record);
}