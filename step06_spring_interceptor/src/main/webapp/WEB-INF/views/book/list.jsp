<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="root" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 목록 페이지</title>
<style type="text/css">
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>
</head>
<body>
	<h1>책 목록 페이지</h1>
	<a href="${root }">메인 화면으로</a>
	<br>
	<a href="${root }/books/add">등록하기</a>
	<table>
		<thead>
			<tr>
				<th>고유번호</th>
				<th>제목</th>
				<th>저자</th>
				<th>가격</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${list}">
				<tr>
					<td>${book.id}</td>
					<td><a href="${root }/books/detail?id=${book.id}">${book.title}</a></td>
					<td>${book.author }</td>
					<td>${book.price }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>