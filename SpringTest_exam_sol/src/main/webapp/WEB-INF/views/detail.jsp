<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="nav.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 정보</title>
</head>
<body>
	<div class="container">
		<h2>상품 상세 정보</h2>
		<table>
			<tr>
				<td>Code</td>
				<td>${product.code}</td>
			</tr>
			<tr>
				<td>Model</td>
				<td>${product.model}</td>
			</tr>
			<tr>
				<td>Price</td>
				<td>${product.price}</td>
			</tr>
			<tr>
				<td>ID</td>
				<td>${product.id}</td>
			</tr>
			<tr>
				<td>Regist Date</td>
				<td>${product.registDate}</td>
			</tr>
			<tr>
				<td>Detail</td>
				<td>${product.detail}</td>
			</tr>
			<tr>
			<td></td>
			</tr>
		</table>
		<br>
		<c:if test="${memberInfo.id eq 'admin' }">
			<a href="${root }/admin/listfull">목록으로</a>
		</c:if>
		<c:if test="${memberInfo.id ne 'admin' }">
			<a href="${root }/list">목록으로</a>
		</c:if>
	</div>
</body>
</html>