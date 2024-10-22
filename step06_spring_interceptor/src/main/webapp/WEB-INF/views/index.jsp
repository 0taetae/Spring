<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<c:set var="root" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>
	<h1>메인 페이지 입니다.</h1>

	<c:if test="${empty userInfo}">
		<a href="${root }/auth/login">로그인</a>
	</c:if>
	<c:if test="${not empty userInfo}">
		<a href="${root }/auth/logout">로그아웃</a>
	</c:if>

	<a href="${root }/books/list">책 목록 페이지</a>
</body>
</html>