<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h3>로그아웃 되었습니다.</h3>

<%
session.invalidate();
%>
<a href="loginForm.jsp">로그인 폼</a>

</body>
</html>