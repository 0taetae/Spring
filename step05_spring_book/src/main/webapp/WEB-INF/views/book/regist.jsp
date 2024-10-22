<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<c:set var="root" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 등록</title>
</head>
<body>
	<h1>책 등록 페이지</h1>
	<form action="${root }/books/add" method="post">
		<fieldset>
			<label><input type="text" name="title"> 제목 </label> <br>
			<label><input type="text" name="author"> 저자 </label> <br>
			<label><input type="number" name="price"> 가격 </label> <br>
			<label><input type="text" name="description"> 설명 </label> <br>
			<input type="submit" value="등록"> <br> <a
				href="${root }/books/list">목록으로</a>
		</fieldset>
	</form>
</body>
</html>