package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Commodity;
import com.apatech.mapper.CommodityMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CommodityService {
	@Autowired
	private CommodityMapper dao;

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
    	PageHelper.startPage(pageNum, pageSize);
    	List<Commodity> list=dao.selectAll();
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