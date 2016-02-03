package net.iretailer.model;
// Generated 2016-2-1 23:19:37 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * TPack5Wifiduration generated by hbm2java
 */
public class TPack5Wifiduration implements java.io.Serializable {

	private Integer id;
	private int zoneId;
	private Date dateTime;
	private String date;
	private Short dateHour;
	private Short dateMin5;
	private String macDetected;
	private Short duration;
	private String rssi;
	private String mpnumber;
	private String ipaddr;

	public TPack5Wifiduration() {
	}

	public TPack5Wifiduration(int zoneId) {
		this.zoneId = zoneId;
	}

	public TPack5Wifiduration(int zoneId, Date dateTime, String date, Short dateHour, Short dateMin5,
			String macDetected, Short duration, String rssi, String mpnumber, String ipaddr) {
		this.zoneId = zoneId;
		this.dateTime = dateTime;
		this.date = date;
		this.dateHour = dateHour;
		this.dateMin5 = dateMin5;
		this.macDetected = macDetected;
		this.duration = duration;
		this.rssi = rssi;
		this.mpnumber = mpnumber;
		this.ipaddr = ipaddr;
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

	public Short getDateHour() {
		return this.dateHour;
	}

	public void setDateHour(Short dateHour) {
		this.dateHour = dateHour;
	}

	public Short getDateMin5() {
		return this.dateMin5;
	}

	public void setDateMin5(Short dateMin5) {
		this.dateMin5 = dateMin5;
	}

	public String getMacDetected() {
		return this.macDetected;
	}

	public void setMacDetected(String macDetected) {
		this.macDetected = macDetected;
	}

	public Short getDuration() {
		return this.duration;
	}

	public void setDuration(Short duration) {
		this.duration = duration;
	}

	public String getRssi() {
		return this.rssi;
	}

	public void setRssi(String rssi) {
		this.rssi = rssi;
	}

	public String getMpnumber() {
		return this.mpnumber;
	}

	public void setMpnumber(String mpnumber) {
		this.mpnumber = mpnumber;
	}

	public String getIpaddr() {
		return this.ipaddr;
	}

	public void setIpaddr(String ipaddr) {
		this.ipaddr = ipaddr;
	}

}
