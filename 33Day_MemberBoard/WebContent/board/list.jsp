<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="board.Article, java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script>
function a(num, pwd, type) {
	n = parseInt(prompt("�� ��й�ȣ", "0"));
	if (n != pwd) {
		alert("��й�ȣ�� Ʋ���ϴ�");
		return;
	}
	locatoin.href="<%=request.getContextPath() %>/BoardController?num=" + num + "&type=" + type;
}


</script>

</head>
<body>

<a href="<%=request.getContextPath() %>/board/form.jsp">�� ����</a> <br>
<a href="<%=request.getContextPath() %>/member/result.jsp">�޴�</a> <br>

<%
ArrayList<Article> list = (ArrayList<Article>) request.getAttribute("list");
%>

<table>
	<tr>
		<th>�� ��ȣ</th>
		<th>�ۼ��� </th>
		<th>�ۼ��� </th>
		<th>�۳��� </th>
		<th>����/����</th>
	</tr>
<%
for (int i = 0; i < list.size(); i++) {
	Article a = list.get(i);
%>
	<tr>
		<td>
			<%=a.getNum() %>
		</td>
		<td>
			<%=a.getWriter() %>
		</td>
		<td>
			<%=a.getW_date() %>
		</td>
		<td>
			<%=a.getContent() %>
		</td>
		<td>
		<% 
			if (a.getWriter().equals((String)session.getAttribute("id"))) {
		%>
			<input type="button" value="edit" onclick="a(<%=a.getNum() %>, <%=a.getPwd() %>, 'editForm')">
			
			<input type="button" value="delete" onclick="a(<%=a.getNum() %>, <%=a.getPwd() %>, 'del')">
		<%
			}
		%>
		</td>
	</tr>

<%
} 
%>

</table>



</body>
</html>