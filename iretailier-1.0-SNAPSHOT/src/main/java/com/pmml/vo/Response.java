package com.pmml.vo;

import java.util.HashMap;
import java.util.Map;

public class Response {
	private String id;
	private Map<String, String> result = new HashMap<String, String>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<String, String> getResult() {
		return result;
	}

	public void setResult(Map<String, String> result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Request [id=" + id + ", arguments=" + result + "]";
	}
}
