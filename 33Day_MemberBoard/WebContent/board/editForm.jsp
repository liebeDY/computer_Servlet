<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="board.Article"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
Article a = (Article) request.getAttribute("a");
%>

<form action="<%=request.getContextPath() %>/BoardController?type=edit&num=<%=a.getNum() %>" method="post">

<table>

	<tr>
		<th>글번호</th>
		<td><%=a.getNum() %></td>
	</tr>

	<tr>
		<th>작성자</th>
		<td><%=a.getWriter() %></td>
	</tr>

	<tr>
		<th>작성일</th>
		<td><%=a.getW_date() %></td>
	</tr>
	
	<tr>
		<th>글 비밀번호</th>
		<td><input type="text" name="pwd" value="<%=a.getPwd() %>"></td>
	</tr>
	
	<tr>
		<th>글 내용</th>
		<td>
			<textarea cols=45 rows=15 name="content"><%=a.getContent() %></textarea>
		</td>
	</tr>
	
	<tr>
		<td><input type="submit" value="수정"></td>
	</tr>
</table>


</form>

</body>
</html>