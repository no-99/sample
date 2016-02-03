<%@ page contentType="text/html;charset=UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Spring MVC Application</title>
</head>

<body>
    Language : <a href="?language=en">English</a> | <a href="?language=zh_CN">Chinese</a>

    <h2><spring:message code="label.Id" text="ID" /></h2>
    <h3><spring:message code="label.Name" text="name" /></h3>
    <h3><spring:message code="label.Page" text="page" /></h3>

    <h4>Current Locale: ${pageContext.response.locale} </h4>
</body>
</html>