package net.iretailer.model;
// Generated 2016-2-1 23:19:37 by Hibernate Tools 4.3.1.Final

/**
 * TAlarmLog generated by hbm2java
 */
public class TAlarmLog implements java.io.Serializable {

	private String id;
	private String alarmCode;
	private String deviceName;
	private String description;
	private String firstTime;
	private String lastTime;
	private String recoverTime;
	private int alarmCount;

	public TAlarmLog() {
	}

	public TAlarmLog(String id, String alarmCode, String deviceName, String description, String firstTime,
			String lastTime, int alarmCount) {
		this.id = id;
		this.alarmCode = alarmCode;
		this.deviceName = deviceName;
		this.description = description;
		this.firstTime = firstTime;
		this.lastTime = lastTime;
		this.alarmCount = alarmCount;
	}

	public TAlarmLog(String id, String alarmCode, String deviceName, String description, String firstTime,
			String lastTime, String recoverTime, int alarmCount) {
		this.id = id;
		this.alarmCode = alarmCode;
		this.deviceName = deviceName;
		this.description = description;
		this.firstTime = firstTime;
		this.lastTime = lastTime;
		this.recoverTime = recoverTime;
		this.alarmCount = alarmCount;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAlarmCode() {
		return this.alarmCode;
	}

	public void setAlarmCode(String alarmCode) {
		this.alarmCode = alarmCode;
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFirstTime() {
		return this.firstTime;
	}

	public void setFirstTime(String firstTime) {
		this.firstTime = firstTime;
	}

	public String getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
	}

	public String getRecoverTime() {
		return this.recoverTime;
	}

	public void setRecoverTime(String recoverTime) {
		this.recoverTime = recoverTime;
	}

	public int getAlarmCount() {
		return this.alarmCount;
	}

	public void setAlarmCount(int alarmCount) {
		this.alarmCount = alarmCount;
	}

}
