<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="member.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
String vo = (String) session.getAttribute("id");
if (vo != null && !vo.equals("")) {
%>
<%= vo %> �� �α���

<a href="<%=request.getContextPath() %>/Controller?type=logout">�α� �ƿ�</a> <br>

<a href="<%=request.getContextPath() %>/Controller?type=out">Ż��</a><br>

<a href="<%=request.getContextPath() %>/Controller?type=search">�� ���� ����</a><br>

<a href="<%=request.getContextPath() %>/BoardController?type=boardList">�Խ���</a><br>
<%
}
%>

</body>
</html>