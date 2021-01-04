<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="model.MemberVO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
	MemberVO vo = new MemberVO("java", "abcd", "아이유", "선릉");
	request.setAttribute("mvo", vo);
%>

EL 연습 -> 이름 : ${requestScope.mvo.name }
		  주소 : ${requestScope.mvo.address }

<hr>
JSTL choose(if~ else if~ else) : when : if, otherwise = else <br>

<c:choose>
	<c:when test="${requestScope.mvo.address == '안양동' }">
	안양
	</c:when>
	<c:when test="${requestScope.mvo.address == '선릉' }">
	강남
	</c:when>
	
	<c:otherwise>
	else를 의미한다
	</c:otherwise>
</c:choose>
</body>
</html>