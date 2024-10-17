<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <%@ taglib
prefix="c" uri="jakarta.tags.core" %>
<c:set var="root" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
  <div align="center">
  ${root }
  	<h3>Spring Web MVC</h3>
  	<a href="${root}/hellomvc1">Hello1 Spring Web MVC</a><br>
  	<a href="${root}/hellomvc2">Hello2 Spring Web MVC</a><br>
  	<a href="${root}/param/single">single parameter test</a><br>
  	<a href="${root}/param/multi">multi parameter test</a>
  </div>
  </body>
</html>
