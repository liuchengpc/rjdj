package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Cashregisterdetail;
import com.apatech.mapper.CashregisterdetailMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CashregisterdetailService {
	@Autowired
	private CashregisterdetailMapper dao;

    public int deleteByPrimaryKey(String cashregisterid) {
    	return dao.deleteByPrimaryKey(cashregisterid);
    }

    public int insert(Cashregisterdetail record) {
    	return dao.insert(record);
    }


    public int insertSelective(Cashregisterdetail record) {
    	return dao.insertSelective(record);
    }


    public Cashregisterdetail selectByPrimaryKey(String cashregisterid) {
    	return dao.selectByPrimaryKey(cashregisterid);
    }
    
    public List<Cashregisterdetail> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Cashregisterdetail> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Cashregisterdetail> list=dao.selectAll();
    	PageInfo<Cashregisterdetail> page=new PageInfo<Cashregisterdetail>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Cashregisterdetail record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Cashregisterdetail record) {
    	return dao.updateByPrimaryKey(record);
    }

}