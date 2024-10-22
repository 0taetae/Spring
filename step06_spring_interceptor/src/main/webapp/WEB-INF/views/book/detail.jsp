<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<c:set var="root" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 상세 페이지</title>
<style type="text/css">
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>
</head>
<body>
	<h1>책 상세 페이지</h1>
	<a href="${root }/books/list">목록으로</a>
	<table>
		<tr>
			<th>고유번호</th>
			<td>${book.id}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${book.title}</td>

		</tr>
		<tr>
			<th>저자</th>
			<td>${book.author}</td>

		</tr>
		<tr>
			<th>가격</th>
			<td>${book.price }</td>
		</tr>
		<tr>
			<th>설명</th>
			<td>${book.description }</td>
		</tr>
		<tr>
	</table>
	<a href="${root }/books/delete?id=${book.id}">삭제</a>
</body>
</html>