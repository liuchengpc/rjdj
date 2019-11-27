package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 会员表
 * @author 刘成
 *
 */
public class Member {
    private Integer memberid;//编号，主键
    private String phone;//手机号
    private String name;//名称
    private Integer memberlvid;//会员等级编号
    private String password;//密码
    private String province;//省（地址）
    private String city;//市（地址）
    private String region;//地区（地址）
    private String street;//街道
    private Float price;//余额
    private Integer integral;//积分
    private String memberlvname;//会员等级名称
    private Integer hycount;//成交次数
    private Integer hysumprice;//成交金额
    @DateTimeFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    private Date hytime;//最近成交 

	public String getMemberlvname() {
		return memberlvname;
	}

	public void setMemberlvname(String memberlvname) {
		this.memberlvname = memberlvname;
	}

	public Integer getHycount() {
		return hycount;
	}

	public void setHycount(Integer hycount) {
		this.hycount = hycount;
	}

	public Integer getHysumprice() {
		return hysumprice;
	}

	public void setHysumprice(Integer hysumprice) {
		this.hysumprice = hysumprice;
	}

	public Date getHytime() {
		return hytime;
	}

	public void setHytime(Date hytime) {
		this.hytime = hytime;
	}

	public Member() {
		super();
	}

	public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getMemberlvid() {
        return memberlvid;
    }

    public void setMemberlvid(Integer memberlvid) {
        this.memberlvid = memberlvid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }
}