package com.openscoring.mgr.model;

import java.util.Arrays;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties({"bytes"})
public class FileMeta {
	
	public static enum STATUS {PUBLISHED, UPLOADED};

	private String uuid;
	private String pmmlUuid;
	private String fileName;
	private String fileSize;
	private String fileType;
	private String modelName;
	private String modelDesc;
	private String status;
	private Date effectDate;
	private byte[] bytes;
	
	public byte[] getBytes() {
		return bytes;
	}
	public Date getEffectDate() {
		return effectDate;
	}

	public String getFileName() {
		return fileName;
	}
	public String getFileSize() {
		return fileSize;
	}
	public String getFileType() {
		return fileType;
	}
	
	public String getModelDesc() {
		return modelDesc;
	}
	public String getModelName() {
		return modelName;
	}
	public String getPmmlUuid() {
		return pmmlUuid;
	}
	public String getStatus() {
		return status;
	}
	public String getUuid() {
		return uuid;
	}
	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}
	public void setEffectDate(Date effectDate) {
		this.effectDate = effectDate;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public void setModelDesc(String modelDesc) {
		this.modelDesc = modelDesc;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void setPmmlUuid(String pmmlUuid) {
		this.pmmlUuid = pmmlUuid;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	@Override
	public String toString() {
		return "FileMeta [uuid=" + uuid + ", pmmlUuid=" + pmmlUuid + ", fileName=" + fileName + ", fileSize=" + fileSize
				+ ", fileType=" + fileType + ", modelName=" + modelName + ", modelDesc=" + modelDesc + ", status="
				+ status + ", effectDate=" + effectDate + ", bytes=" + Arrays.toString(bytes) + "]";
	}
}