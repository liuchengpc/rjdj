package com.apatech.domain;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 订单主表
 * @author 刘成
 *
 */
public class Cashregister {
    private String ashregisterid;//订单主表键
    @DateTimeFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    private Date time;//日期
    private String shopid;//店铺ID
    private Integer count;//购买数量
    private Float moneyamt;//合计
    private Integer memberid;//会员ID
    private String cashregistername;//收银人员
    private Integer ispresent;//是否付款    (0:否 默认：0  1:是)
    private List<Cashregisterdetail> list;//集合
    private Member member;	//会员对象
    private Memberlv memberlv;	//会员等级对象
    
    
	public String getAshregisterid() {
		return ashregisterid;
	}
	public void setAshregisterid(String ashregisterid) {
		this.ashregisterid = ashregisterid;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getShopid() {
		return shopid;
	}
	public void setShopid(String shopid) {
		this.shopid = shopid;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Float getMoneyamt() {
		return moneyamt;
	}
	public void setMoneyamt(Float moneyamt) {
		this.moneyamt = moneyamt;
	}
	public Integer getMemberid() {
		return memberid;
	}
	public void setMemberid(Integer memberid) {
		this.memberid = memberid;
	}
	public String getCashregistername() {
		return cashregistername;
	}
	public void setCashregistername(String cashregistername) {
		this.cashregistername = cashregistername;
	}
	public Integer getIspresent() {
		return ispresent;
	}
	public void setIspresent(Integer ispresent) {
		this.ispresent = ispresent;
	}
	public List<Cashregisterdetail> getList() {
		return list;
	}
	public void setList(List<Cashregisterdetail> list) {
		this.list = list;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Memberlv getMemberlv() {
		return memberlv;
	}
	public void setMemberlv(Memberlv memberlv) {
		this.memberlv = memberlv;
	}
	@Override
	public String toString() {
		return "Cashregister [ashregisterid=" + ashregisterid + ", time=" + time + ", shopid=" + shopid + ", count="
				+ count + ", moneyamt=" + moneyamt + ", memberid=" + memberid + ", cashregistername=" + cashregistername
				+ ", ispresent=" + ispresent + ", list=" + list + ", member=" + member + ", memberlv=" + memberlv + "]";
	}
	public Cashregister(String ashregisterid, Date time, String shopid, Integer count, Float moneyamt, Integer memberid,
			String cashregistername, Integer ispresent, List<Cashregisterdetail> list, Member member,
			Memberlv memberlv) {
		super();
		this.ashregisterid = ashregisterid;
		this.time = time;
		this.shopid = shopid;
		this.count = count;
		this.moneyamt = moneyamt;
		this.memberid = memberid;
		this.cashregistername = cashregistername;
		this.ispresent = ispresent;
		this.list = list;
		this.member = member;
		this.memberlv = memberlv;
	}

	public Cashregister() {
		super();
	}
    
}