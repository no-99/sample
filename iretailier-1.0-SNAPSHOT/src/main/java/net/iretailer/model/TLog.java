package net.iretailer.model;
// Generated 2016-2-1 23:19:37 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * TLog generated by hbm2java
 */
public class TLog implements java.io.Serializable {

	private Integer id;
	private Integer deviceId;
	private Date dateTime;
	private Date date;
	private Short levelId;
	private Short eventId;
	private String message;

	public TLog() {
	}

	public TLog(Integer deviceId, Date dateTime, Date date, Short levelId, Short eventId, String message) {
		this.deviceId = deviceId;
		this.dateTime = dateTime;
		this.date = date;
		this.levelId = levelId;
		this.eventId = eventId;
		this.message = message;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
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

	public Short getLevelId() {
		return this.levelId;
	}

	public void setLevelId(Short levelId) {
		this.levelId = levelId;
	}

	public Short getEventId() {
		return this.eventId;
	}

	public void setEventId(Short eventId) {
		this.eventId = eventId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
