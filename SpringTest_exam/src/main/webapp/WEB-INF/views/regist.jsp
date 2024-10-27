<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="root" value="${pageContext.request.contextPath}" />
<%@ include file="nav.jsp" %>
	
	<div style="max-width: 800px; margin: 20px auto; padding: 20px; background-color: white; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);">
		<h2>상품 정보를 등록하세요</h2>
		<form id="registForm" method="post" action="${root }/regist">
			<table>
				<tr>
					<td><label for="productCode">고유번호</label></td>
					<td><input type="text" id="productCode" name="code" placeholder="고유번호 입력"></td>
				</tr>
				<tr>
					<td><label for="model">모델명</label></td>
					<td><input type="text" id="model" name="model" placeholder="모델명 입력"></td>
				</tr>
				<tr>
					<td><label for="price">가격</label></td>
					<td><input type="number" id="price" name="price" placeholder="가격 입력"></td>
				</tr>
				<tr>
					<td><label for="userId">등록자 ID</label></td>
					<td><input type="text" id="id" name="id" value="${memberInfo.id }"></td>
				</tr>
				<tr>
					<td><label for="description">상세설명</label></td>
					<td><textarea id="description" name="detail"></textarea></td>
				</tr>
				<tr>
					<td colspan="2">
						<button type="submit" class="btn-primary">등록</button>
						<button type="button" class="btn-secondary" onclick="location.href=''">취소</button>
					</td>
				</tr>
				<tr>
			</table>
		</form>
	</div>
</body>
</html>
