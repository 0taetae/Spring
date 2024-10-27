<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<style>
body {
	font-family: 'Arial', sans-serif;
	margin: 0;
	padding: 0;
	background-color: #f4f4f4;
}

.navbar {
	background-color: #333;
	color: white;
	padding: 10px 20px;
	display: flex;
	justify-content: space-between;
	align-items: center;
}

.navbar a {
	color: white;
	text-decoration: none;
	padding: 10px 15px;
}

.container {
	max-width: 1200px;
	margin: 20px auto;
	padding: 20px;
	background-color: white;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h1 {
	color: #333;
}
</style>
</head>
<body>
<c:if test="${not empty message}" >
<script> 
top.alert(`${message}`)
</script>
</c:if>
	<div class="navbar">
		<div>
			<a href="${root }/">상품 관리</a>
		</div>
		<c:choose>
            <c:when test="${memberInfo == null}">
                <form action="${root }/login" method="post">
                    <input type="text" id="userId" name="userId" placeholder="ID" required>
                    <input type="password" name="password" placeholder="Password" required>
                    <button type="submit">Login</button>
                    <a href="${root }/join">회원가입</a>
                </form>
          	</c:when>
	        <c:otherwise>
				<div>
		        	${memberInfo.id}님 (${memberInfo.name})이 로그인 하였습니다.
		        	<a href="${root }/logout">로그아웃</a>
		        	<c:if test="${memberInfo.id eq 'admin' }">
					<a href="${root }/admin/listfull">상품 목록</a> 
					</c:if>
		        	<c:if test="${memberInfo.id ne 'admin' }">
					<a href="${root }/list">상품 목록</a> 
					</c:if>
					<a href="${root }/regist">상품 정보 등록</a>
				</div>
			</c:otherwise>
        </c:choose>
	</div>
	
	
	
	
	
	
	
	