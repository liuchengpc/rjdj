package com.apatech.domain;
/**
 * 店铺表
 * @author 刘成
 *
 */
public class Shop {
    private String shopid;//编号，主键
    private String userid;//用户编号，外键
    private String shopname;//店铺名称
    private String contacts;//联系人
    private String phonenumber;//手机号
    private String fixedtelephone;//固定电话
    private String starttime;//营业开始时间
    private String endtime;//营业结束时间
    private String province;//省（地址）
    private String city;//市（地址）
    private String region;//地区（地址）
    private String address;//详细地址
    private String introduction;//简介
    private String shopimg;//图片
    
    

    @Override
	public String toString() {
		return "Shop [shopid=" + shopid + ", userid=" + userid + ", shopname=" + shopname + ", contacts=" + contacts
				+ ", phonenumber=" + phonenumber + ", fixedtelephone=" + fixedtelephone + ", starttime=" + starttime
				+ ", endtime=" + endtime + ", province=" + province + ", city=" + city + ", region=" + region
				+ ", address=" + address + ", introduction=" + introduction + ", shopimg=" + shopimg + "]";
	}

	public Shop() {
		super();
	}

	public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getFixedtelephone() {
        return fixedtelephone;
    }

    public void setFixedtelephone(String fixedtelephone) {
        this.fixedtelephone = fixedtelephone == null ? null : fixedtelephone.trim();
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getShopimg() {
        return shopimg;
    }

    public void setShopimg(String shopimg) {
        this.shopimg = shopimg == null ? null : shopimg.trim();
    }
}