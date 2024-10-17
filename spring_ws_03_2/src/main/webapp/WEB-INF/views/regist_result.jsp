<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 등록 결과</title>
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
	<h1>영화 등록 결과</h1>
	<h2>등록 영화 정보</h2>
	<table class="table">
		<thead>
			<tr>
				<th>항목</th>
				<th colspan="2">내용</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>영화 제목</td>
				<td colspan="2">${movie.title }</td>
			</tr>
			<tr>
				<td>감독</td>
				<td colspan="2">${movie.director }</td>
			</tr>
			<tr>
				<td>장르</td>
				<td colspan="2">${movie.genre }</td>
			</tr>
			<tr>
				<td>상영 시간</td>
				<td colspan="2">${movie.runningTime }</td>
			</tr>
		</tbody>
	</table>
	<!-- 다시 자동차를 등록할 수 있는 링크를 제공한다. -->
	<a href="./regist">추가등록</a>
	</div>
</body>
</html>
