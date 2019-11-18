package com.apatech.domain;
/**
 * 用户信息管理表
 * @author 刘成
 *
 */
public class Users {
    private String userid;//账号，主键
    private String password;//用户名
    private String username;//账户密码
    private String industry;//行业
    private String phonenumber;//手机号码
    private String headportrait;//头像
    private Integer roleid;//角色ID
    private String shopid;//店铺ID
    
    

    @Override
	public String toString() {
		return "Users [userid=" + userid + ", password=" + password + ", username=" + username + ", industry="
				+ industry + ", phonenumber=" + phonenumber + ", headportrait=" + headportrait + ", roleid=" + roleid
				+ ", shopid=" + shopid + "]";
	}

	public Users() {
		super();
	}

	public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getHeadportrait() {
        return headportrait;
    }

    public void setHeadportrait(String headportrait) {
        this.headportrait = headportrait == null ? null : headportrait.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }
}