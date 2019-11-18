package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Bill;
import com.apatech.mapper.BillMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class BillService {
	@Autowired
	private BillMapper dao;

    public int deleteByPrimaryKey(String billid) {
    	return dao.deleteByPrimaryKey(billid);
    }

    public int insert(Bill record) {
    	return dao.insert(record);
    }


    public int insertSelective(Bill record) {
    	return dao.insertSelective(record);
    }


    public Bill selectByPrimaryKey(String billid) {
    	return dao.selectByPrimaryKey(billid);
    }
    
    public List<Bill> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Bill> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Bill> list=dao.selectAll();
    	PageInfo<Bill> page=new PageInfo<Bill>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Bill record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Bill record) {
    	return dao.updateByPrimaryKey(record);
    }

}