package net.iretailer.model;
// Generated 2016-2-1 23:19:37 by Hibernate Tools 4.3.1.Final

/**
 * TrStoreRelation generated by hbm2java
 */
public class TrStoreRelation implements java.io.Serializable {

	private Integer id;
	private String storeId;
	private String customerId;

	public TrStoreRelation() {
	}

	public TrStoreRelation(String storeId, String customerId) {
		this.storeId = storeId;
		this.customerId = customerId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

}
