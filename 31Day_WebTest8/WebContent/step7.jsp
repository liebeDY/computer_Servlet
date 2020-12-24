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
	private String name = "손연재";
	public int getAge() {
		return 19; 
	}
%>

이름 : <%=name %>, 나이 : <%=getAge() %>세

</body>
</html>