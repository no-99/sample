package com.pmml.vo;

import java.util.HashMap;
import java.util.Map;

public class Request {
	private String id;
	private Map<String, Double> arguments = new HashMap<String, Double>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<String, Double> getArguments() {
		return arguments;
	}

	public void setArguments(Map<String, Double> arguments) {
		this.arguments = arguments;
	}

	@Override
	public String toString() {
		return "Request [id=" + id + ", arguments=" + arguments + "]";
	}
}
