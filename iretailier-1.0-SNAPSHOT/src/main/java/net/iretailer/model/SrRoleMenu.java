package net.iretailer.model;
// Generated 2016-2-1 23:19:37 by Hibernate Tools 4.3.1.Final

/**
 * SrRoleMenu generated by hbm2java
 */
public class SrRoleMenu implements java.io.Serializable {

	private String id;
	private String roleId;
	private String menuId;

	public SrRoleMenu() {
	}

	public SrRoleMenu(String id, String roleId, String menuId) {
		this.id = id;
		this.roleId = roleId;
		this.menuId = menuId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getMenuId() {
		return this.menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

}
