package net.iretailer.model;
// Generated 2016-2-1 23:19:37 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * Familyflow generated by hbm2java
 */
public class Familyflow implements java.io.Serializable {

	private Integer id;
	private int zoneId;
	private Date dateTime;
	private Date date;
	private Short dateHour;
	private Short dateMin;
	private Short countEnter;
	private Short countExit;

	public Familyflow() {
	}

	public Familyflow(int zoneId) {
		this.zoneId = zoneId;
	}

	public Familyflow(int zoneId, Date dateTime, Date date, Short dateHour, Short dateMin, Short countEnter,
			Short countExit) {
		this.zoneId = zoneId;
		this.dateTime = dateTime;
		this.date = date;
		this.dateHour = dateHour;
		this.dateMin = dateMin;
		this.countEnter = countEnter;
		this.countExit = countExit;
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

	public Short getDateHour() {
		return this.dateHour;
	}

	public void setDateHour(Short dateHour) {
		this.dateHour = dateHour;
	}

	public Short getDateMin() {
		return this.dateMin;
	}

	public void setDateMin(Short dateMin) {
		this.dateMin = dateMin;
	}

	public Short getCountEnter() {
		return this.countEnter;
	}

	public void setCountEnter(Short countEnter) {
		this.countEnter = countEnter;
	}

	public Short getCountExit() {
		return this.countExit;
	}

	public void setCountExit(Short countExit) {
		this.countExit = countExit;
	}

}
