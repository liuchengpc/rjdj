package com.apatech.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apatech.domain.Cashregister;
import com.apatech.domain.Commodity;
import com.apatech.service.CashregisterService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("CashregisterController")
public class CashregisterController {
	@Autowired
	private CashregisterService dao;	
	/**
	 * 查询全部
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selectAll",method = RequestMethod.GET)
	@ResponseBody
	public List<Cashregister> selectAll(Model model) {
		System.out.println("进入CashregisterController查询全部");
		List<Cashregister> list = dao.selectAll();
		return list;
	}
	/**
	 * 根据主键查询
	 * @param billid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Cashregister selectByPrimaryKey(String ashregisterid) {
		System.out.println("进入CashregisterController根据主键查询");
		System.out.println("ashregisterid="+ashregisterid);
    	return dao.selectByPrimaryKey(ashregisterid);
    }
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Cashregister> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入CashregisterController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Cashregister> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	
	
	/**
	 * 根据条件查询采购单主详表(销售统计)
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAll2",method = RequestMethod.GET)
	@ResponseBody
	public List<Cashregister> selectAll2(
			Integer shopid,//店铺
 			@DateTimeFormat(pattern = "yyyy-MM-dd")Date oldtime,//开始时间
 			@DateTimeFormat(pattern = "yyyy-MM-dd")Date newtime,//结束时间
			String selectqb//查找
	){
		System.out.println("进入CommodityController根据条件查询采购单主详表(销售统计)");
		System.out.println(shopid+"/"+oldtime+"/"+newtime+"/"+selectqb);
    	List<Cashregister> list=dao.selectAll2(shopid, oldtime, newtime, selectqb);
    	System.out.println(list.toString());
    	return list;
    }
	/**
	 * 根据条件查询采购单主详表(营收概况)
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAll3",method = RequestMethod.GET)
	@ResponseBody
	public List<Cashregister> selectAll3(
			Integer shopid,//店铺
 			@DateTimeFormat(pattern = "yyyy-MM-dd")Date oldtime,//开始时间
 			@DateTimeFormat(pattern = "yyyy-MM-dd")Date newtime,//结束时间
			String selectqb//查找
	){
		System.out.println("进入CommodityController根据条件查询采购单主详表(营收概况)");
		System.out.println(shopid+"/"+oldtime+"/"+newtime+"/"+selectqb);
    	List<Cashregister> list=dao.selectAll3(shopid, oldtime, newtime, selectqb);
    	System.out.println(list.toString());
    	return list;
    }
	/**
	 * 根据条件查询采购单主详表(热销商品)
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAll4",method = RequestMethod.GET)
	@ResponseBody
	public List<Cashregister> selectAll4(
			Integer shopid,//店铺
			@DateTimeFormat(pattern = "yyyy-MM-dd")Date oldtime,//开始时间
			@DateTimeFormat(pattern = "yyyy-MM-dd")Date newtime,//结束时间
			String selectqb,//查找
			Integer commoditytypeid//商品类别
			){
		System.out.println("进入CommodityController根据条件查询采购单主详表(营收概况)");
		System.out.println(shopid+"/"+oldtime+"/"+newtime+"/"+selectqb+"/"+commoditytypeid);
		List<Cashregister> list=dao.selectAll4(shopid, oldtime, newtime, selectqb, commoditytypeid);
		System.out.println(list.toString());
		return list;
	}
	
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Cashregister record) {
		System.out.println("进入CashregisterController新增");
		System.out.println("实体："+record.toString());
		Map<String, String> map=new HashMap<String,String>();
    	int i=dao.insertSelective(record);
    	if (i>0) {
			map.put("code", "1");
			map.put("message", "新增成功！");
		}else {
			map.put("code", "2");
			map.put("message", "新增失败！");
		}
		return map;
    }

	/**
	 * 根据主键修改
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "updateByPrimaryKeySelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Cashregister record) {
		System.out.println("进入CashregisterController根据主键修改");
		System.out.println("实体："+record.toString());
		Map<String, String> map=new HashMap<String, String>();
    	int i=dao.updateByPrimaryKeySelective(record);
    	if (i>0) {
			map.put("code", "1");
			map.put("message", "修改成功！");
		}else {
			map.put("code", "2");
			map.put("message", "修改失败！");
		}
		return map;
    }
	/**
	 * 根据主键删除
	 * @param billid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String ashregisterid,Model model) {
		System.out.println("进入CashregisterController根据主键删除");
		System.out.println("ashregisterid："+ashregisterid);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(ashregisterid);
		if (i>0) {
			map.put("code", "1");
			map.put("message", "删除成功！");
		}else {
			map.put("code", "2");
			map.put("message", "删除失败！");
		}
		return map;
    }

}