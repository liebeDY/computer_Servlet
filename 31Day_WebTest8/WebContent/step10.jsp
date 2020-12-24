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
	request.setCharacterEncoding("utf-8");
	int age = Integer.parseInt(request.getParameter("userAge"));
	String name = request.getParameter("userName");
%>

<%
	if (age >= 19) {
%>
		<%=name %>님 성인입니다.
<%
	} else {
%>
		<%=name %>님 미성년자입니다.
<%
	}
%>

</body>
</html>