package net.iretailer.model;
// Generated 2016-2-1 23:19:37 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * TWifidetectdaily generated by hbm2java
 */
public class TWifidetectdaily implements java.io.Serializable {

	private Integer id;
	private int zoneId;
	private String macDetected;
	private Integer visitTimes;
	private Date firstTime;
	private Date latestTime;
	private Short duration;
	private String ipaddr;
	private String maxRssi;
	private String minRssi;
	private String mpnumber;

	public TWifidetectdaily() {
	}

	public TWifidetectdaily(int zoneId) {
		this.zoneId = zoneId;
	}

	public TWifidetectdaily(int zoneId, String macDetected, Integer visitTimes, Date firstTime, Date latestTime,
			Short duration, String ipaddr, String maxRssi, String minRssi, String mpnumber) {
		this.zoneId = zoneId;
		this.macDetected = macDetected;
		this.visitTimes = visitTimes;
		this.firstTime = firstTime;
		this.latestTime = latestTime;
		this.duration = duration;
		this.ipaddr = ipaddr;
		this.maxRssi = maxRssi;
		this.minRssi = minRssi;
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

	public String getMacDetected() {
		return this.macDetected;
	}

	public void setMacDetected(String macDetected) {
		this.macDetected = macDetected;
	}

	public Integer getVisitTimes() {
		return this.visitTimes;
	}

	public void setVisitTimes(Integer visitTimes) {
		this.visitTimes = visitTimes;
	}

	public Date getFirstTime() {
		return this.firstTime;
	}

	public void setFirstTime(Date firstTime) {
		this.firstTime = firstTime;
	}

	public Date getLatestTime() {
		return this.latestTime;
	}

	public void setLatestTime(Date latestTime) {
		this.latestTime = latestTime;
	}

	public Short getDuration() {
		return this.duration;
	}

	public void setDuration(Short duration) {
		this.duration = duration;
	}

	public String getIpaddr() {
		return this.ipaddr;
	}

	public void setIpaddr(String ipaddr) {
		this.ipaddr = ipaddr;
	}

	public String getMaxRssi() {
		return this.maxRssi;
	}

	public void setMaxRssi(String maxRssi) {
		this.maxRssi = maxRssi;
	}

	public String getMinRssi() {
		return this.minRssi;
	}

	public void setMinRssi(String minRssi) {
		this.minRssi = minRssi;
	}

	public String getMpnumber() {
		return this.mpnumber;
	}

	public void setMpnumber(String mpnumber) {
		this.mpnumber = mpnumber;
	}

}
