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
		<th>�۹�ȣ</th>
		<td><%=a.getNum() %></td>
	</tr>

	<tr>
		<th>�ۼ���</th>
		<td><%=a.getWriter() %></td>
	</tr>

	<tr>
		<th>�ۼ���</th>
		<td><%=a.getW_date() %></td>
	</tr>
	
	<tr>
		<th>�� ��й�ȣ</th>
		<td><input type="text" name="pwd" value="<%=a.getPwd() %>"></td>
	</tr>
	
	<tr>
		<th>�� ����</th>
		<td>
			<textarea cols=45 rows=15 name="content"><%=a.getContent() %></textarea>
		</td>
	</tr>
	
	<tr>
		<td><input type="submit" value="����"></td>
	</tr>
</table>


</form>

</body>
</html>