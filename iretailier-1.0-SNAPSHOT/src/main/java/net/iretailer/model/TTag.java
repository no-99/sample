package net.iretailer.model;
// Generated 2016-2-1 23:19:37 by Hibernate Tools 4.3.1.Final

/**
 * TTag generated by hbm2java
 */
public class TTag implements java.io.Serializable {

	private String id;
	private String tableName;
	private String keyId;
	private String tagName;
	private String tagValue;

	public TTag() {
	}

	public TTag(String id, String tableName) {
		this.id = id;
		this.tableName = tableName;
	}

	public TTag(String id, String tableName, String keyId, String tagName, String tagValue) {
		this.id = id;
		this.tableName = tableName;
		this.keyId = keyId;
		this.tagName = tagName;
		this.tagValue = tagValue;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getKeyId() {
		return this.keyId;
	}

	public void setKeyId(String keyId) {
		this.keyId = keyId;
	}

	public String getTagName() {
		return this.tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getTagValue() {
		return this.tagValue;
	}

	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

}
