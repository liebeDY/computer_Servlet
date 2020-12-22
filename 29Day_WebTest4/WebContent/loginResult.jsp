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
		boolean result = false;
	if (!session.isNew()) {
		result = (boolean) session.getAttribute("result");
	}

	String id = "";
	if (result) {
		id = (String) session.getAttribute("id");
	%>

	로그인 성공
	<br>

	<%=id%>
	님 반값습니다.
	<br>
	<a href="logout.jsp">로그아웃</a>
	<%
		} else {
	%>
	로그인 실패
	<br>
	<a href="loginForm.jsp">로그인 폼</a>

	<%
		}
	%>
</body>
</html>