<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${root }/list">전체보기</a>
	<a href="${root }/searchEmp">검색(사번 10이하,'발'이포함)</a>
	<form action="${root }/insert" method="post">
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" name="ename" /></td>
			</tr>
			<tr>
				<td>연락처</td>
				<td><input type="text" name="phone" /></td>
			</tr>
			<tr>
				<td>부서</td>
				<td><input type="text" name="dept" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="등록" />
				</td>
			</tr>
		</table>
	</form>
	<br>
	<br> 번호로 찾기:
	<input type="text" id="eno">
	<input type="button" id="sbtn" value="찾기">
	<br>
	<br>
	<div id="display"></div>
</body>
</html>
<script>
document.querySelector("#sbtn").addEventListener("click", function() {
	let id=document.querySelector("#eno").value;
	console.log("test:" + id);
	fetch(`${root}/searchNo?eno=${"${id}"}`)  
	        .then(response => response.json())  // 서버에서 받은 응답을 JSON 형식으로 변환
	        .then(data =>makeList(data));  // 응답으로 받은 JSON 데이터를 makeList 함수에 전달
});
function makeList(data){
	console.log(data);  // data 확인 
	let list=``;
	list +=`
		<tr>
        <td>`+ data.eno + `</td>
        <td>${"${data.ename}"}</td>
        <td>${"${data.phone}"}</td>
        <td>${"${data.dept}"}</td>
    </tr>`;
	document.querySelector("#display").innerHTML=list;  // 테이블 행을 추가 
}
</script>

















