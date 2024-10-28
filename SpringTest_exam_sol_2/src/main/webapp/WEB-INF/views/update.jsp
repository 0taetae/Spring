<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="nav.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>상품 수정</title>
</head>
<body>
<div class="container">
    <h2>상품 수정</h2>
    <form action="${root}/updateProduct" method="post">
        <input type="hidden" name="code" value="${product.code}" />
        <label for="model">Model:</label>
        <input type="text" id="model" name="model" value="${product.model}" required /><br><br>

        <label for="price">Price:</label>
        <input type="number" id="price" name="price" value="${product.price}" required /><br><br>

        <label for="detail">Detail:</label>
        <textarea id="detail" name="detail" rows="4" cols="50">${product.detail}</textarea><br><br>

        <input type="submit" value="수정 완료" />
    </form>
</div>
</body>
</html>