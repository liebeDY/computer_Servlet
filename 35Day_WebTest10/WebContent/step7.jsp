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
pageContext.setAttribute("pageScope", "page data");
request.setAttribute("requestScope", "request data");
session.setAttribute("sessionScope", "session data");
application.setAttribute("applicationScope", "application data");

%>

���� ���α׷��� �⺻ ��� : ${pageContext.request.contextPath } <br>
scope�� �������� �ʾ��� ���� data �� : ${data } <br>
scope�� pageContext �� �������� ���� data �� : ${pageScope.data } <br>
scope�� request �� �������� ���� data �� : ${requestScope.data } <br>
scope�� session �� �������� ���� data �� : ${sessionScope.data } <br>
scope�� application �� �������� ���� data �� : ${applicationScope.data } <br>
</body>
</html>