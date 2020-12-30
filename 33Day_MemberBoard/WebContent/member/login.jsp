<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form action="<%=request.getContextPath() %>/Controller?type=login" method="post">
<table border=1>
	<tr>
		<td>id</td>
		<td><input type="text" name="id"></td>
	</tr>
	
	<tr>
		<td>pwd</td>
		<td><input type="password" name="pwd"></td>
	</tr>
	
	<tr>
		<td colspan="2">
			<input type="submit" value="로그인">
			<a href="<%=request.getContextPath() %>/member/form.jsp">회원가입</a>
		</td>
	</tr>
</table>
</form>



</body>
</html>