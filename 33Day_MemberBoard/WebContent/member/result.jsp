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
<%= vo %> 님 로그인

<a href="<%=request.getContextPath() %>/Controller?type=logout">로그 아웃</a> <br>

<a href="<%=request.getContextPath() %>/Controller?type=out">탈퇴</a><br>

<a href="<%=request.getContextPath() %>/Controller?type=search">내 정보 수정</a><br>

<a href="<%=request.getContextPath() %>/BoardController?type=boardList">게시판</a><br>
<%
}
%>

</body>
</html>