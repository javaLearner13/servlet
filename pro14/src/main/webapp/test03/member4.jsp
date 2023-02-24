<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("utf-8");
%>
<c:set var="id" value="hong" scope="page"/>
<c:set var="pwd" value="1234" scope="page"/>
<c:set var="name" value="${'홍길동' }" scope="page"/>
<c:set var="age" value="${22 }" scope="page"/>
<c:set var="height" value="${177}" scope="page"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>remove</title>
</head>
<body>
	<c:if test = "${true }">
		<h1>always true</h1>
	</c:if>
	<c:if test="${11==11 }">
		<h1>same</h1>
	</c:if>
	<c:if test="${11!=31 }">
		<h1>not equal</h1>
	</c:if>
	<c:if test="${(id=='hong')&&(name=='홍길동') }">
		<h1>id = ${id }, name = ${name }</h1>
	</c:if>
	<c:if test="${age==22 }">
		<h1>${name }'s age is ${age}</h1>
	</c:if>
	<c:if test="${height>160 }">
		<h1>${name }'s height taller than 160</h1>
	</c:if>
</body>
</html>