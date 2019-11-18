package com.apatech.domain;
/**
 * 权限类型管理表
 * @author 刘成
 *
 */
public class Ptmanagement {
    private Integer ptid; //编号，主键
	private Integer privilegetypeid;//权限类型ID
    private Integer privilegeid;//权限ID
    
    @Override
   	public String toString() {
   		return "Ptmanagement [ptid=" + ptid + ", privilegetypeid=" + privilegetypeid + ", privilegeid=" + privilegeid
   				+ "]";
   	}

    public Ptmanagement() {
		super();
	}

	public Integer getPtid() {
        return ptid;
    }

    public void setPtid(Integer ptid) {
        this.ptid = ptid;
    }

    public Integer getPrivilegetypeid() {
        return privilegetypeid;
    }

    public void setPrivilegetypeid(Integer privilegetypeid) {
        this.privilegetypeid = privilegetypeid;
    }

    public Integer getPrivilegeid() {
        return privilegeid;
    }

    public void setPrivilegeid(Integer privilegeid) {
        this.privilegeid = privilegeid;
    }
}