<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>좋아하는 과일</h1>
${result.userName}(${result.userAge})님 <br>
좋아하는 과일은 
<c:if test="${result.fruit ne null}">
	<c:forEach var="fruit" items="${result.fruit}">
		${fruit}
	</c:forEach>
	입니다.
</c:if>
<c:if test="${result.fruit eq null}">
	없습니다.
</c:if>
</body>
</html>