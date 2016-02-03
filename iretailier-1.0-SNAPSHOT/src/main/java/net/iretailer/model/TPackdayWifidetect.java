package net.iretailer.model;
// Generated 2016-2-1 23:19:37 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * TPackdayWifidetect generated by hbm2java
 */
public class TPackdayWifidetect implements java.io.Serializable {

	private Integer id;
	private int zoneId;
	private Date dateTime;
	private String date;
	private Integer numMacDetected;
	private Integer numMacEnter;
	private Integer numMacEnterReturn;
	private Integer numMacEnterNew;

	public TPackdayWifidetect() {
	}

	public TPackdayWifidetect(int zoneId) {
		this.zoneId = zoneId;
	}

	public TPackdayWifidetect(int zoneId, Date dateTime, String date, Integer numMacDetected, Integer numMacEnter,
			Integer numMacEnterReturn, Integer numMacEnterNew) {
		this.zoneId = zoneId;
		this.dateTime = dateTime;
		this.date = date;
		this.numMacDetected = numMacDetected;
		this.numMacEnter = numMacEnter;
		this.numMacEnterReturn = numMacEnterReturn;
		this.numMacEnterNew = numMacEnterNew;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(int zoneId) {
		this.zoneId = zoneId;
	}

	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getNumMacDetected() {
		return this.numMacDetected;
	}

	public void setNumMacDetected(Integer numMacDetected) {
		this.numMacDetected = numMacDetected;
	}

	public Integer getNumMacEnter() {
		return this.numMacEnter;
	}

	public void setNumMacEnter(Integer numMacEnter) {
		this.numMacEnter = numMacEnter;
	}

	public Integer getNumMacEnterReturn() {
		return this.numMacEnterReturn;
	}

	public void setNumMacEnterReturn(Integer numMacEnterReturn) {
		this.numMacEnterReturn = numMacEnterReturn;
	}

	public Integer getNumMacEnterNew() {
		return this.numMacEnterNew;
	}

	public void setNumMacEnterNew(Integer numMacEnterNew) {
		this.numMacEnterNew = numMacEnterNew;
	}

}
