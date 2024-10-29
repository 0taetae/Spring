<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri=jakarta.tags.core %>
<c:set var="root" value="${pagyContext.request.contextPath }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${root }/css/app.css"/>
</head>
<body>
<h1>
<img src="${root }/img/ssafy_logo.png" class="logo"/>
Hello Spring Boot (jsp)</h1>
<h3>${msg1 }</h3>
<h3>#{msg2 }</h3>
<h3>#{msg3 }</h3>
<h3>#{msg4 }</h3>
</body>
</html>