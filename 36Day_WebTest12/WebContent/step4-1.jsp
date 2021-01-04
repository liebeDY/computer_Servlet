<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- jstl 변수 처리 --%>
<c:set var="name" value="${param.userName }"></c:set>
<c:set var="age" value="${param.userAge }"></c:set>

<c:choose>
	<c:when test="${age > 18 }">
		${name }님 성인 입니다.
	</c:when>
	
	<c:when test="${age <= 18 && age >= 13 }">
		${name }님 청소년 입니다.
	</c:when>
	
	<c:otherwise>
		${name }님 어린이 입니다.
	</c:otherwise>
</c:choose>



</body>
</html>