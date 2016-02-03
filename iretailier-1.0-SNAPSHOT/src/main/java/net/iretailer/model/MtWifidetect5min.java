package net.iretailer.model;
// Generated 2016-2-1 23:19:37 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * MtWifidetect5min generated by hbm2java
 */
public class MtWifidetect5min implements java.io.Serializable {

	private Integer id;
	private int zoneId;
	private Date dateTime;
	private Date date;
	private String ipaddr;
	private String macDetected;
	private Boolean enter;
	private String rssi;
	private String mpnumber;

	public MtWifidetect5min() {
	}

	public MtWifidetect5min(int zoneId) {
		this.zoneId = zoneId;
	}

	public MtWifidetect5min(int zoneId, Date dateTime, Date date, String ipaddr, String macDetected, Boolean enter,
			String rssi, String mpnumber) {
		this.zoneId = zoneId;
		this.dateTime = dateTime;
		this.date = date;
		this.ipaddr = ipaddr;
		this.macDetected = macDetected;
		this.enter = enter;
		this.rssi = rssi;
		this.mpnumber = mpnumber;
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

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getIpaddr() {
		return this.ipaddr;
	}

	public void setIpaddr(String ipaddr) {
		this.ipaddr = ipaddr;
	}

	public String getMacDetected() {
		return this.macDetected;
	}

	public void setMacDetected(String macDetected) {
		this.macDetected = macDetected;
	}

	public Boolean getEnter() {
		return this.enter;
	}

	public void setEnter(Boolean enter) {
		this.enter = enter;
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

}
