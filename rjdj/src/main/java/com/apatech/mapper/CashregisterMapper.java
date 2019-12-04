package com.apatech.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Cashregister;
import com.apatech.domain.Commodity;

public interface CashregisterMapper {
	List<Cashregister> queryByMemberID(Integer memberid);
	
	List<Cashregister> queryByGd(String ashregisterid);
	
	int insertCashregister(Cashregister cash);
	
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
    
    List<Cashregister> selectAll3(
    		@Param("shopid")String shopid,//店铺
    		@Param("oldtime")Date oldtime,//开始时间
    		@Param("newtime")Date newtime,//结束时间
    		@Param("selectqb")String selectqb//查找
	);
    List<Cashregister> selectAll4(
    		@Param("shopid")String shopid,//店铺
    		@Param("oldtime")Date oldtime,//开始时间
    		@Param("newtime")Date newtime,//结束时间
    		@Param("selectqb")String selectqb//查找
    		);
    
    List<Cashregister> selectAll5(
    		@Param("shopid")String shopid,//店铺
    		@Param("oldtime")Date oldtime,//开始时间
    		@Param("newtime")Date newtime,//结束时间
    		@Param("selectqb")String selectqb,//查找
    		@Param("commoditytypeid")Integer commoditytypeid//商品类别id
    		);
    


    int updateByPrimaryKeySelective(Cashregister record);

    int updateByPrimaryKey(Cashregister record);
}