<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${empty id }">
	{"msg" :"는 사용할 수 있다."}
</c:if>
<c:if test="${!empty id }">
	${"msg":"${id.id }"는 사용 불가 }
</c:if>