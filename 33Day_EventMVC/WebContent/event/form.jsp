<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form action="<%=request.getContextPath() %>/control" method="post">
<input type="hidden" name="type" value="insert">
id :
<input type="text" name="id"><br>
email :
<input type="text" name="email"><br>
pwd :
<input type="password" name="pwd"><br>

<input type="submit" value="이벤트 등록">
<a href="<%=request.getContextPath() %>/control?type=list">등록자 명단 보기</a>
</form>


</body>
</html>