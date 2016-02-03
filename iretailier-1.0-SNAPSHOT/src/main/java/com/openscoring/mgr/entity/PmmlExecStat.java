package com.openscoring.mgr.entity;

import java.util.Date;

/**
 * PmmlExecStat generated by hbm2java
 */
public class PmmlExecStat implements java.io.Serializable {

	private String uuid;
	private String pmmlHisUuid;
	private Date createTime;
	private String statDesc;
	private String stat;

	public PmmlExecStat() {
	}

	public PmmlExecStat(String uuid) {
		this.uuid = uuid;
	}

	public PmmlExecStat(String uuid, String pmmlHisUuid, Date createTime, String statDesc, String stat) {
		this.uuid = uuid;
		this.pmmlHisUuid = pmmlHisUuid;
		this.createTime = createTime;
		this.statDesc = statDesc;
		this.stat = stat;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getPmmlHisUuid() {
		return this.pmmlHisUuid;
	}

	public void setPmmlHisUuid(String pmmlHisUuid) {
		this.pmmlHisUuid = pmmlHisUuid;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getStatDesc() {
		return this.statDesc;
	}

	public void setStatDesc(String statDesc) {
		this.statDesc = statDesc;
	}

	public String getStat() {
		return this.stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

}