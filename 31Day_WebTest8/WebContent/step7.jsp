<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%!
	private String name = "�տ���";
	public int getAge() {
		return 19; 
	}
%>

�̸� : <%=name %>, ���� : <%=getAge() %>��

</body>
</html>