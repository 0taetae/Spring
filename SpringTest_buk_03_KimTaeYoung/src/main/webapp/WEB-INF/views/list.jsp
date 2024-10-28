<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

	<div class="container">
		<h1>상품 목록</h1>
		<form method="get">
			<label for="searchDate">날짜 검색:</label> 
			<input type="date" id="searchDate" name="searchDate"> 
			<input type="submit" value="검색"><br>
		</form>
		<form action="${root}/delete" method="post"> 	
			<table border="1" width="1000">
				<tr>
					<th> </th>
					<th>reservationId</th>
					<th>userId</th>
					<th>resourceId</th>
					<th>startDate</th>
					<th>endDate</th>
				</tr>
				<c:forEach var="ob" items="${product }">
					<tr>
					    <td><input type="checkbox" name="productIds" value="${ob.code }"></td>
						<td>${ob.reservationId }</a></td>
						<td>${ob.userId }</td>
						<td>${ob.resourceId }</td>
						<td>${ob.startDate }</td>
						<td>${ob.endDate }</td>
					</tr>
				</c:forEach>
			</table><br>
			<input type="submit" value="삭제">
	        <a href="${root}/" class="main-button">처음으로</a>
        </form>
	</div>
</body>
</html>
