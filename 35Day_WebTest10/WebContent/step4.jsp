<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="model.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	Member m = new Member("aaa", "111", "nara", "nara@email.com");
	pageContext.setAttribute("m", m);
%>

id : ${m["id"] } <br>
pwd : ${m["pwd"] } <br>
name : ${m["name"] } <br>
email : ${m["emali"] } <br>
</body>
</html>