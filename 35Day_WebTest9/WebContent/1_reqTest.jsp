<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
	request.setAttribute("age", 23);
	response.sendRedirect("3.resTest.jsp?name=Hon");
%>

pageContext : ���� ������ �������� ����
request : ��û�� ���� ������ ���޵� ������ ���� ����
session : Ŭ���̾�Ʈ�� ������ ���� ������ ���� ����
application : �� ���ø����̼��� ������ ������ ����
</body>
</html>