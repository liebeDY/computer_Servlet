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

pageContext : 현제 페이지 내에서만 공유
request : 요청에 대한 응답이 전달될 때까지 정보 공유
session : 클라이언트와 연결이 끊길 때까지 정보 공유
application : 웹 어플리케이션이 종료할 때까지 공유
</body>
</html>