package com.apatech.domain;
/**
 * 权限类型表
 * @author 刘成
 *
 */
public class Privilegetype {
    private Integer privilegetypeid;//编号，主键
    private String privilegetype;//  类型名称
    

    @Override
	public String toString() {
		return "Privilegetype [privilegetypeid=" + privilegetypeid + ", privilegetype=" + privilegetype + "]";
	}

	public Privilegetype() {
		super();
	}

	public Integer getPrivilegetypeid() {
        return privilegetypeid;
    }

    public void setPrivilegetypeid(Integer privilegetypeid) {
        this.privilegetypeid = privilegetypeid;
    }

    public String getPrivilegetype() {
        return privilegetype;
    }

    public void setPrivilegetype(String privilegetype) {
        this.privilegetype = privilegetype == null ? null : privilegetype.trim();
    }
}