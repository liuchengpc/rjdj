package com.apatech.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Cashregister;
import com.apatech.domain.Cashregisterdetail;
import com.apatech.domain.Commodity;
import com.apatech.domain.Detail;
import com.apatech.mapper.CashregisterMapper;
import com.apatech.mapper.CashregisterdetailMapper;
import com.apatech.mapper.MemberMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CashregisterService {
	@Autowired
	private CashregisterMapper dao;
	@Autowired
	private CashregisterdetailMapper dao2;
	
	@Autowired 
	private MemberMapper mdao;

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
    
    public List<Commodity> selectAll2(
    		Integer shopid,//店铺
 			@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date oldtime,//开始时间
 			@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date newtime,//结束时间
			String selectqb//查找
	){
	List<Commodity> li=dao.selectAll3(shopid, oldtime, newtime, selectqb);
//    	for (int i = 0; i < li.size(); i++) {//根据主表的id将详情表的数据添加到主表的对应对象的list
//    		List<Cashregisterdetail> li2=dao2.selectByid(li.get(i).getBillid());
//    		Double cgdje=0.0;//采购单金额
//    		for (Detail detail : li2) {
//				cgdje+=(detail.getCount()*detail.getCostprice());
//			}
//    		
//    		System.out.println("商品详情："+li2.toString());
//    		li.get(i).setCgdsl(li2.size());
//    		li.get(i).setCgdje(cgdje);
//			li.get(i).setBilllist(li2);
//		}
    	return li;
    }
    
    public PageInfo<Cashregister> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Cashregister> list=dao.selectAll();
    	PageInfo<Cashregister> page=new PageInfo<Cashregister>(list);
    	return page;
    }
    /**
     * 主详详查询
     */
	/*
	 * public PageInfo<Cashregister> queryAll(Integer pageNum,Integer pageSize){
	 * Page<Cashregister> page = PageHelper.startPage(pageNum, pageSize);
	 * List<Cashregister> list=dao.selectAll(); for (Cashregister cashregister :
	 * list) { List<Cashregisterdetail>
	 * l=dao2.selectByPrimaryKey1(cashregister.get); cashregister.setList(); }
	 * return page.toPageInfo(); }
	 */
    /**
     * 多条件分页查询
     * @param pageNum
     * @param pageSize
     * @param PhoneOrName
     * @param startTime
     * @param endTime
     * @return
     */
    public PageInfo<Cashregister> selectByAllpage(Integer pageNum,Integer pageSize,String PhoneOrName,Date startTime,Date endTime){
    	Page<Cashregister> page = PageHelper.startPage(pageNum, pageSize);
    	List<Cashregister> list=dao.selectByAll(PhoneOrName,startTime,endTime);
    		for (Cashregister cashregister : list) {
    			cashregister.setMember(mdao.selectByPrimaryKey(cashregister.getMemberid()));
			}
    	return page.toPageInfo();
    }


    public int updateByPrimaryKeySelective(Cashregister record) {
    	return dao.updateByPrimaryKeySelective(record);
    }
 

    public int updateByPrimaryKey(Cashregister record) {
    	return dao.updateByPrimaryKey(record);
    }

}