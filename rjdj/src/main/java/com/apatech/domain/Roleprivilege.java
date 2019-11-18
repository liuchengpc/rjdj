package com.apatech.domain;
/**
 * 角色权限管理表
 * @author 刘成
 *
 */
public class Roleprivilege {
    private Integer roleprivilegeid;//编号，主键
    private Integer roleid;//角色ID
    private Integer privilegeid;//权限ID
    
    

    @Override
	public String toString() {
		return "Roleprivilege [roleprivilegeid=" + roleprivilegeid + ", roleid=" + roleid + ", privilegeid="
				+ privilegeid + "]";
	}

	public Roleprivilege() {
		super();
	}

	public Integer getRoleprivilegeid() {
        return roleprivilegeid;
    }

    public void setRoleprivilegeid(Integer roleprivilegeid) {
        this.roleprivilegeid = roleprivilegeid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getPrivilegeid() {
        return privilegeid;
    }

    public void setPrivilegeid(Integer privilegeid) {
        this.privilegeid = privilegeid;
    }
}