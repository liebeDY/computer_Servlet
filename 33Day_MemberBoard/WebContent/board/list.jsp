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
	n = parseInt(prompt("글 비밀번호", "0"));
	if (n != pwd) {
		alert("비밀번호가 틀립니다");
		return;
	}
	locatoin.href="<%=request.getContextPath() %>/BoardController?num=" + num + "&type=" + type;
}


</script>

</head>
<body>

<a href="<%=request.getContextPath() %>/board/form.jsp">글 쓰기</a> <br>
<a href="<%=request.getContextPath() %>/member/result.jsp">메뉴</a> <br>

<%
ArrayList<Article> list = (ArrayList<Article>) request.getAttribute("list");
%>

<table>
	<tr>
		<th>글 번호</th>
		<th>작성자 </th>
		<th>작성일 </th>
		<th>글내용 </th>
		<th>수정/삭제</th>
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