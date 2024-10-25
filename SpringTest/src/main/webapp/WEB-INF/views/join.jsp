<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="nav.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원 가입</title>
</head>
<body>
    <div class="container">
        <h2>회원 정보 입력</h2>
        <form action="join" method="post">
        	<table>
        		<tr>
        			<td><label for="userId">아이디</label></td>
        			<td><input type="text" id="userId" name="id" required></td>
        		</tr>
        		<tr>
        			<td><label for="password">비밀번호</label></td>
        			<td><input type="password" id="password" name="password" required></td>
        		</tr>
        		<tr>
        			<td><label for="userName">이름</label></td>
        			<td><input type="text" id="userName" name="name" required></td>
        		</tr>
        		<tr>
        			<td><label for="join_date">가입일</label></td>
        			<td><input type="text" id="join_date" name="join_date"></td>
        		</tr>
        		<tr>
        			<td colspan="2"><input type="submit" value="가입하기"></td>
        		</tr>
            </table>
        </form>
    </div>
</body>
</html>