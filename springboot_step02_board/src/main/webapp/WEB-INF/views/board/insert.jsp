<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>글작성</title>
<link rel="stylesheet" href="/board/assets/css/index.css"/>
</head>
<body>
<h1>글쓰기</h1>
<a href="/board/list">리스트</a>
<a href="/board">처음화면</a>
<form id="form" action="" method="post">
	<table width="500" border="0">
		<tr>
			<th>작성자</th>
			<td><input type="text" name="writer" id="writer" size="12" maxlength="12"></td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td><input type="password" name="pwd" id="pwd" size="12" maxlength="12"></td>
		</tr>
		<tr>
			<th>제목</th>
			<td><input type="text" name="title" id="title" size="50" maxlength="50"></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea name="content" id="content" rows="5" cols="50"></textarea></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" id="subBtn" value="저장">
				<input type="reset" value="취소">
			</td>
		</tr>
	</table>
</form>
    <script src="/board/assets/js/insert.js"></script>
</body>
</html>