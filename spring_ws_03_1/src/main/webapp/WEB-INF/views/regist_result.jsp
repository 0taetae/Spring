<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자동차 등록 결과</title>
<style>
table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	border: 1px solid black;
}

th:nth-child(1) {
	width: 100px;
}
</style>
</head>
<body>
	<div class="container">
	<h1>자동차 등록 결과</h1>
	<h2>등록 자동차 정보</h2>
	<c:if test="${!empty car }">
	<table class="table">
		<thead>
			<tr>
				<th>항목</th>
				<th colspan="2">내용</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>자동차 번호</td>
				<td colspan="2">${car.vin }</td>
			</tr>
			<tr>
				<td>모델명</td>
				<td colspan="2">${car.modelName }</td>
			</tr>
			<tr>
				<td>색상</td>
				<td colspan="2">${car.color }</td>
			</tr>
			<tr>
				<td>주행 거리</td>
				<td colspan="2">${car.mileage }</td>
			</tr>
		</tbody>
	</table>
	</c:if>
	<c:if test="${empty book }">
		<p>등록된 자동차가 없습니다.</p>
	</c:if>
	<!-- 다시 자동차를 등록할 수 있는 링크를 제공한다. -->
	<a href="./regist">추가등록</a>
	</div>
</body>
</html>
