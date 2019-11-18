package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Commodity;
import com.apatech.domain.Commoditydetail;
import com.apatech.mapper.CommodityMapper;
import com.apatech.mapper.CommoditydetailMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CommodityService {
	@Autowired
	private CommodityMapper dao;
	@Autowired
	private CommoditydetailMapper dao2;

    public int deleteByPrimaryKey(String productcodeid) {
    	return dao.deleteByPrimaryKey(productcodeid);
    }

    public int insert(Commodity record) {
    	return dao.insert(record);
    }


    public int insertSelective(Commodity record) {
    	return dao.insertSelective(record);
    }


    public Commodity selectByPrimaryKey(String productcodeid) {
    	return dao.selectByPrimaryKey(productcodeid);
    }
    
    public List<Commodity> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Commodity> selectAllpage(Integer pageNum,Integer pageSize){
    	List<Commodity> li=dao.selectAll();
    	for (int i = 0; i < li.size(); i++) {//根据主表的id将详情表的数据添加到主表的对应对象的list
    		List<Commoditydetail> li2=dao2.selectByid(li.get(i).getProductcodeid());
			li.get(i).setList(li2);
		}
    	PageHelper.startPage(pageNum, pageSize);
    	List<Commodity> list=li;
    	PageInfo<Commodity> page=new PageInfo<Commodity>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Commodity record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Commodity record) {
    	return dao.updateByPrimaryKey(record);
    }

}