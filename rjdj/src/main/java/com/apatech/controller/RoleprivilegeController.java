package com.apatech.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.TinyBitSet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apatech.domain.Roleprivilege;
import com.apatech.service.RoleprivilegeService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("RoleprivilegeController")
public class RoleprivilegeController {
	@Autowired
	private RoleprivilegeService dao;	
	/**
	 * 查询全部
	 * @param model
	 * @return
	 */
	@RequestMapping("/selectAll")
	public String selectAll(Model model) {
		System.out.println("进入RoleprivilegeController查询全部");
		List<Roleprivilege> list = dao.selectAll();
		model.addAttribute("list", list);
		return "index";
	}
	/**
	 * 根据主键查询
	 * @param billid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Roleprivilege selectByPrimaryKey(Integer roleprivilegeid) {
		System.out.println("进入RoleprivilegeController根据主键查询");
		System.out.println("roleprivilegeid="+roleprivilegeid);
    	return dao.selectByPrimaryKey(roleprivilegeid);
    }
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Roleprivilege> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入RoleprivilegeController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Roleprivilege> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Roleprivilege record) {
		System.out.println("进入RoleprivilegeController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Roleprivilege record) {
		System.out.println("进入RoleprivilegeController根据主键修改");
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
    public Map<String, String> deleteByPrimaryKey(Integer roleprivilegeid,Model model) {
		System.out.println("进入RoleprivilegeController根据主键删除");
		System.out.println("roleprivilegeid："+roleprivilegeid);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(roleprivilegeid);
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