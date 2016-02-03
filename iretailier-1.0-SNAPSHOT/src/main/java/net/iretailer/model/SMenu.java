package net.iretailer.model;
// Generated 2016-2-1 23:19:37 by Hibernate Tools 4.3.1.Final

/**
 * SMenu generated by hbm2java
 */
public class SMenu implements java.io.Serializable {

	private String id;
	private String name;
	private String parentId;
	private String imageUrl;
	private String pageUrl;
	private short visible;
	private int rank;
	private String description;

	public SMenu() {
	}

	public SMenu(String id, String parentId, short visible, int rank) {
		this.id = id;
		this.parentId = parentId;
		this.visible = visible;
		this.rank = rank;
	}

	public SMenu(String id, String name, String parentId, String imageUrl, String pageUrl, short visible, int rank,
			String description) {
		this.id = id;
		this.name = name;
		this.parentId = parentId;
		this.imageUrl = imageUrl;
		this.pageUrl = pageUrl;
		this.visible = visible;
		this.rank = rank;
		this.description = description;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getPageUrl() {
		return this.pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public short getVisible() {
		return this.visible;
	}

	public void setVisible(short visible) {
		this.visible = visible;
	}

	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
