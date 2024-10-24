<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>** 검색된 고객 정보 **</h3>
<c:if test="${empty customer}">
찾으시는 고객이 존재하지 않습니다.<br>
</c:if>
<c:if test="${!empty customer }">
아이디 : ${customer.id }<br>
패스워드 : ${customer.password }<br>
이름 : ${customer.name }<br>
</c:if>
<a href="${root }/">홈 화면으로 이동</a>
</body>
</html>
