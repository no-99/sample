<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<%@page language="java" import="java.util.*,com.openscoring.mgr.model.*" contentType="text/html; charset=UTF-8"%>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<spring:url value="/resources/js/jquery.1.9.1.min.js" var="jquery" />
<spring:url value="/resources/js/vendor/jquery.ui.widget.js" var="jquerywidget" />
<spring:url value="/resources/js/jquery.iframe-transport.js" var="jqueryiframetransport" />
<spring:url value="/resources/js/jquery.fileupload.js" var="jqueryfileupload" />
<spring:url value="/resources/bootstrap/js/bootstrap.min.js" var="bootstrapjs" />
<spring:url value="/resources/bootstrap/css/bootstrap.css" var="bootstrapcss" />
<spring:url value="/resources/css/dropzone.css" var="dropzonecss" />
<spring:url value="/resources/css/pmml.css" var="pmmlcss" />
<spring:url value="/resources/js/modelmgr.js" var="modelmgr" />
<spring:url value="/resources/js/myuploadfunction.js" var="upload" />
   	<script src="${jquery}"></script>
	<script src="${jquerywidget}"></script>
	<script src="${jqueryiframetransport}"></script>
	<script src="${jqueryfileupload}"></script>
	<script src="${bootstrapjs}"></script>
	<script src="${upload}"></script>
	<script src="${modelmgr}"></script>
	<link href="${bootstrapcss}" type="text/css" rel="stylesheet" />
	<link href="${dropzonecss}" type="text/css" rel="stylesheet" />
	<link href="${pmmlcss}" type="text/css" rel="stylesheet" />
</head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>
    <p th:text="'Pmml, ' + ${name} + '!'" />
    <!-- <div style="float:left">
    	<input style="border:1px solid;width:200px;height:30px;float:left;margin-right:20px"></input>
    	<input type="button" value="搜索" style="height:30px;widht:40px;margin-right:20px" />
    	<input type="button" value="添加新模型" style="height:30px;widht:40px;margin-right:20px" />
    </div>
    <div style="clear:both"></div>
    <div style="float:left">
    	<div style="width:200px;height:30px;float:left;margin-right:20px">模型列表</div>
    	<input type="button" value="发布" style="height:30px;widht:40px;margin-right:20px" />
    </div>
    <div style="clear:both"></div> -->
    <h1>Risk Model - Pmml File Upload</h1>
<div style="width:500px;padding:20px">

	<input id="fileupload" type="file" name="files[]" data-url="../controller/upload" multiple>
	
	<div id="dropzone" class="fade well">Drop files here</div>
	
	<div id="progress" class="progress">
    	<div class="bar" style="width: 0%;"></div>
	</div>

	<table id="uploaded-files" class="table">
		<tr>
			<th>模型ID</th>
    		<th>模型名称</th>
    		<th>模型描述</th>
    		<th>生效时间</th>
			<th>File Name</th>
			<th>File Size</th>
			<th>File Type</th>
			<th>下载</th>
			<th>发布</th>
			<th>调用</th>
			<th>察看 </th>
		</tr>
		<c:forEach items="${fileMetas}" var="fileMeta">
    			<tr>
	    			<td><div class="cell">${fileMeta.pmmlUuid}</div></td>
	    			<td><div class="cell">${fileMeta.modelName}</div></td>
	    			<td><div class="cell">${fileMeta.modelDesc}</div></td>
	    			<td><div class="cell">${fileMeta.effectDate}</div></td>
	    			<td><div class="cell">${fileMeta.fileName}</div></td>
	    			<td><div class="cell">${fileMeta.fileSize}</div></td>
	    			<td><div class="cell">${fileMeta.fileType}</div></td>
	    			<td><div class="cell"><a href='../../rest/controller/get/${fileMeta.uuid }'>Click</a></div></td>
	    			<td>
	    					<div class="publish" id="${fileMeta.uuid}" 
	    				<c:if test="${fileMeta.status != 'PUBLISHED'}">
	    						style="display:block"
	    				</c:if>
	    					>发布</div>
	    			</td>
	    			<td>
	    					<div class="exec" id="${fileMeta.modelName}" 
	    				<c:if test="${fileMeta.status == 'PUBLISHED'}">
	    					style="display:block"
	    				</c:if>
	    					><a target="_blank" href="request?id=${fileMeta.modelName }">调用</a></div>
	    			</td>
	    			<td>
	    					<div class="view" id="${fileMeta.modelName}" 
	    				<c:if test="${fileMeta.status == 'PUBLISHED'}">
	    					style="display:block"
	    				</c:if>
	    					><a target="_blank" href="http://localhost:9080/openscoring-webapp-1.2.0/model/${fileMeta.modelName }">察看</a></div>
	    			</td>
	    		</tr>
		    </c:forEach>
	</table>
</div>
    <div style="clear:both"></div>
    <div style="float:left">
    </div>
</body>
</html>