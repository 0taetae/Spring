<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ include file="nav.jsp" %>

	<div class="container">
		<h1>전체 상품 목록</h1>
		<form method="get">
			<label for="searchDate">날짜 검색:</label> 
			<input type="date" id="searchDate" name="searchDate"> 
			<input type="submit" value="검색">
		</form><br>
		<table border="1" width="1000">
			<tr>
				<th>Code</th>
				<th>Model</th>
				<th>Price</th>
				<th>ID</th>
				<th>Regist Date</th>
				<th>Detail</th>
				<th>Del</th>
			</tr>
			<c:forEach var="ob" items="${products }">
				<tr>
					<td><a href="">${ob.code }</a></td>
					<td>${ob.model }</td>
					<td>${ob.price }</td>
					<td>${ob.id }</td>
					<td>${ob.regist_date }</td>
					<td>${ob.detail }</td>
					<td>
						<form action="${root}/admin/delProduct" method="post">
							<input type="hidden" name="productId" value="${ob.id}"> 
							<input type="submit" value="삭제">
						</form>
					</td>
				</tr>
			</c:forEach>
		</table><br>
        <a href="${root}/" class="main-button">처음으로</a>
	</div>
</body>
</html>
