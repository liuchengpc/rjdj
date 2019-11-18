package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Users;
import com.apatech.mapper.UsersMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class UsersService {
	@Autowired
	private UsersMapper dao;

    public int deleteByPrimaryKey(String userid) {
    	return dao.deleteByPrimaryKey(userid);
    }

    public int insert(Users record) {
    	return dao.insert(record);
    }


    public int insertSelective(Users record) {
    	return dao.insertSelective(record);
    }


    public Users selectByPrimaryKey(String userid) {
    	return dao.selectByPrimaryKey(userid);
    }
    
    public List<Users> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Users> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Users> list=dao.selectAll();
    	PageInfo<Users> page=new PageInfo<Users>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Users record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Users record) {
    	return dao.updateByPrimaryKey(record);
    }

}