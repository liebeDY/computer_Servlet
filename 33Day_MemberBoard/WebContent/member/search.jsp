<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="member.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
Member m = (Member) request.getAttribute("m");
%>

<form name="f" action="<%=request.getContextPath() %>/Controller?type=edit" method="post">

<table>
	<tr>
		<td>id</td>
		<td><input type="text" name="id" readonly value="<%=m.getId() %>"></td>
	</tr>
	
	<tr>
		<td>pwd</td>
		<td><input type="password" name="pwd" value="<%=m.getPwd() %>"></td>
	</tr>

	<tr>
		<td>name</td>
		<td><input type="text" name="name" readonly value="<%=m.getName()%>"></td>
	</tr>
	
	<tr>
		<td>email</td>
		<td><input type="text" name="email" value="<%=m.getEmail() %>"></td>
	</tr>
	
	<tr>
		<td><input type="submit" value="수정"></td>
	</tr>
</table>
</form>



</body>
</html>