package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Member;
import com.apatech.mapper.MemberMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class MemberService {
	@Autowired
	private MemberMapper dao;

    public int deleteByPrimaryKey(Integer memberid) {
    	return dao.deleteByPrimaryKey(memberid);
    }

    public int insert(Member record) {
    	return dao.insert(record);
    }


    public int insertSelective(Member record) {
    	return dao.insertSelective(record);
    }


    public Member selectByPrimaryKey(Integer memberid) {
    	return dao.selectByPrimaryKey(memberid);
    }
    
    public List<Member> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Member> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Member> list=dao.selectAll();
    	PageInfo<Member> page=new PageInfo<Member>(list);
    	return page;
    }
    
    public PageInfo<Member> queryAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Member> list=dao.queryAll();
    	PageInfo<Member> page=new PageInfo<Member>(list);
    	return page;
    }

    public int updateByPrimaryKeySelective(Member record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Member record) {
    	return dao.updateByPrimaryKey(record);
    }

}