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
	pwd = prompt("��й�ȣ�� �Է��ϼ���");
	if(pwd1 == pwd) {
		// location.href = URL�� �̵�, �����丮�� ����� ���´�
<%-- 		location.replace("<%=request.getContextPath() %>/control?num="+num+"&type="+type"); // URL�� �̵�, ����� ���� �ʴ´� --%>
		location.replace("<%=request.getContextPath() %>/control?num="+num+"&type="+type);
	} else {
		alert("��й�ȣ ����");
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
		<th>����</th>
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
		<td><input type="button" value="����" onclick="a('<%=x.getNum() %>', '<%=x.getPwd() %>', 'delete')"></td>
	</tr>
	
	<%}%>

</table>

</body>
</html>