package com.apatech.domain;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import com.apatech.mapper.MemberMapper;
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
    private Member member;//会员表
	/*
	 * @Autowired private MemberMapper dao;
	 */

	public Member getMember() {
		/* return dao.selectByPrimaryKey(memberid); */
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "Cashregister [ashregisterid=" + ashregisterid + ", time=" + time + ", shopid=" + shopid + ", count="
				+ count + ", moneyamt=" + moneyamt + ", memberid=" + memberid + ", cashregistername=" + cashregistername
				+ ", ispresent=" + ispresent + ", list=" + list + ", member=" + member + "]";
	}

	public Cashregister() {
		super();
	}

	public String getAshregisterid() {
        return ashregisterid;
    }

    public void setAshregisterid(String ashregisterid) {
        this.ashregisterid = ashregisterid == null ? null : ashregisterid.trim();
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
        this.shopid = shopid == null ? null : shopid.trim();
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
        this.cashregistername = cashregistername == null ? null : cashregistername.trim();
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
    
}