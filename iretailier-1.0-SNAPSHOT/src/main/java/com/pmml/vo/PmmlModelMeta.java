package com.pmml.vo;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class PmmlModelMeta {
	private String id;
	private String miningFunction;
	private String summary;
	private Map<String, String> properties = new HashMap<String, String>();
	private Map<String, List> schema = new HashMap<String, List>();
}