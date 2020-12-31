<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>login</h3>
<form action="<%=request.getContextPath() %>/LoginController" method="post">
id :
<input type="text" name="id"><br>
pwd :
<input type="text" name="pwd"><br>
<input type="submit" value="로그인"><br>

</form>
<a href="<%=request.getContextPath() %>/member/form.jsp">회원가입</a>

</body>
</html>