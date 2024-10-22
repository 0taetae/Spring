<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<c:set var="root" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<h1>로그인 화면</h1>

	<form action="${root }/auth/login" method="post">
		<label><input type="text" name="id"> 아이디</label> <br> <label><input
			type="text" name="password"> 비밀번호</label> <br> <input
			type="submit" value="로그인">
	</form>
</body>
</html>