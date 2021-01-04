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
<%-- jstl ���� ó�� --%>
<c:set var="name" value="${param.userName }"></c:set>
<c:set var="age" value="${param.userAge }"></c:set>

<c:choose>
	<c:when test="${age > 18 }">
		${name }�� ���� �Դϴ�.
	</c:when>
	
	<c:when test="${age <= 18 && age >= 13 }">
		${name }�� û�ҳ� �Դϴ�.
	</c:when>
	
	<c:otherwise>
		${name }�� ��� �Դϴ�.
	</c:otherwise>
</c:choose>



</body>
</html>