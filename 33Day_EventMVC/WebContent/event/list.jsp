<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "model.Member" %>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<script>
function a(num, pwd1, type){
	pwd = prompt("비밀번호를 입력하세요");
	if(pwd1 == pwd) {
		// location.href = URL로 이동, 히스토리에 기록이 남는다
<%-- 		location.replace("<%=request.getContextPath() %>/control?num="+num+"&type="+type"); // URL로 이동, 기록이 남지 않는다 --%>
		location.replace("<%=request.getContextPath() %>/control?num="+num+"&type="+type);
	} else {
		alert("비밀번호 실패");
	}
}
</script>
</head>
<body>
<%
ArrayList<Member> list = (ArrayList<Member>) request.getAttribute("data");
%>

<table border=1>
	<tr>
		<th>Num</th>
		<th>Id</th>
		<th>Email</th>
		<th>Pwd</th>
		<th>삭제</th>
	</tr>
	
<%
for (int i = 0; i < list.size(); i++) {
	Member x = list.get(i);	
%>
	<tr>
		<td><%=x.getNum() %></td>
		<td><a href="javascript:a('<%=x.getNum() %>','<%=x.getPwd() %>','editForm')"><%=x.getId() %></a></td>
		<td><%=x.getEmail() %></td>
		<td><%=x.getPwd() %></td>
		<td><input type="button" value="삭제" onclick="a('<%=x.getNum() %>', '<%=x.getPwd() %>', 'delete')"></td>
	</tr>
	
	<%}%>

</table>

</body>
</html>