<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="model.Member" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
Member m = (Member) request.getAttribute("member");
%>

<form action="<%=request.getContextPath() %>/control?num=<%=m.getNum() %>" method="post">
<input type="hidden" name="type" value="edit">
id : 
<input type="text" name="id" value="<%=m.getId() %>" readonly> <br>
email :
<input type="text" name="email" value="<%=m.getEmail() %>"> <br>
pwd:
<input type="text" name="pwd" value="<%=m.getPwd() %>"> <br>
<input type="submit" value="수정">
</form>


</body>
</html>