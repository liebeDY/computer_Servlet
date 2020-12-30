<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/BoardController?type=write" method="post">

<table>
	<tr>
		<th>작성자</th>
		<td><%=session.getAttribute("id") %></td>
	</tr>
	
	<tr>
		<th>글 비밀번호</th>
		<td><input type="text" name="pwd"></td>
	</tr>

	<tr>
		<th>글 내용</th>
		<td><textarea rows="15" cols="45" name="content"></textarea></td>
	</tr>
	
	<tr>
		<td><input type="submit" value="저장"></td>
	</tr>

</table>




</form>

</body>
</html>