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
	MemberVO vo = new MemberVO("java", "abcd", "������", "����");
	request.setAttribute("mvo", vo);
%>

EL ���� -> �̸� : ${requestScope.mvo.name }
		  �ּ� : ${requestScope.mvo.address }

<hr>
JSTL choose(if~ else if~ else) : when : if, otherwise = else <br>

<c:choose>
	<c:when test="${requestScope.mvo.address == '�Ⱦ絿' }">
	�Ⱦ�
	</c:when>
	<c:when test="${requestScope.mvo.address == '����' }">
	����
	</c:when>
	
	<c:otherwise>
	else�� �ǹ��Ѵ�
	</c:otherwise>
</c:choose>
</body>
</html>