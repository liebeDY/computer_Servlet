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

	�α��� ����
	<br>

	<%=id%>
	�� �ݰ����ϴ�.
	<br>
	<a href="logout.jsp">�α׾ƿ�</a>
	<%
		} else {
	%>
	�α��� ����
	<br>
	<a href="loginForm.jsp">�α��� ��</a>

	<%
		}
	%>
</body>
</html>