package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Cashregister;
import com.apatech.mapper.CashregisterMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CashregisterService {
	@Autowired
	private CashregisterMapper dao;

    public int deleteByPrimaryKey(String ashregisterid) {
    	return dao.deleteByPrimaryKey(ashregisterid);
    }

    public int insert(Cashregister record) {
    	return dao.insert(record);
    }


    public int insertSelective(Cashregister record) {
    	return dao.insertSelective(record);
    }


    public Cashregister selectByPrimaryKey(String ashregisterid) {
    	return dao.selectByPrimaryKey(ashregisterid);
    }
    
    public List<Cashregister> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Cashregister> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Cashregister> list=dao.selectAll();
    	PageInfo<Cashregister> page=new PageInfo<Cashregister>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Cashregister record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Cashregister record) {
    	return dao.updateByPrimaryKey(record);
    }

}