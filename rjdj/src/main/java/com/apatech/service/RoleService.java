package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Role;
import com.apatech.mapper.RoleMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class RoleService {
	@Autowired
	private RoleMapper dao;

    public int deleteByPrimaryKey(Integer roleid) {
    	return dao.deleteByPrimaryKey(roleid);
    }

    public int insert(Role record) {
    	return dao.insert(record);
    }


    public int insertSelective(Role record) {
    	return dao.insertSelective(record);
    }


    public Role selectByPrimaryKey(Integer roleid) {
    	return dao.selectByPrimaryKey(roleid);
    }
    
    public List<Role> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Role> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Role> list=dao.selectAll();
    	PageInfo<Role> page=new PageInfo<Role>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Role record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Role record) {
    	return dao.updateByPrimaryKey(record);
    }

}