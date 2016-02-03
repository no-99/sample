<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<%@page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<spring:url value="/resources/js/jquery.1.9.1.min.js" var="jquery" />
<spring:url value="/resources/js/vendor/jquery.ui.widget.js" var="jquerywidget" />
<spring:url value="/resources/css/pmml.css" var="pmmlcss" />
<spring:url value="/resources/js/modelexec.js" var="modelexec" />
   	<script src="${jquery}"></script>
	<script src="${jquerywidget}"></script>
	<script src="${bootstrapjs}"></script>
	<script src="${modelexec}"></script>
	<link href="${bootstrapcss}" type="text/css" rel="stylesheet" />
	<link href="${pmmlcss}" type="text/css" rel="stylesheet" />
</head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>
    <p th:text="'Pmml, ' + ${name} + '!'" />
    <h1>Risk Model - Pmml request</h1>
<div style="width:500px;padding:20px">

</div>
    <div style="clear:both"></div>
    <div style="float:left;margin-bottom:10px;">模型调用参数</div>
    <div style="clear:both"></div>
    <div style="float:left">
    	<textarea  id="request"></textarea>
    </div>
    <div style="clear:both"></div>
    <div id="modelname" style="display:none">${name}</div>
    <div style="float:left" id="exec">
    	调用
    </div>
    <div style="clear:both"></div>
    <div style="float:left;margin-bottom:10px;" >模型调用结果</div>
    <div style="clear:both"></div>
    <div style="float:left;margin-bottom:10px;" id="result"></div>
</body>
</html>