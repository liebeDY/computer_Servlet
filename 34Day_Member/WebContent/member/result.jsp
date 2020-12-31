<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
		boolean flag = false;
	if (!session.isNew()) {
		flag = (boolean) session.getAttribute("flag");
	}
	if (flag) {
		String id = (String) session.getAttribute("id");
	%>

	<%=id%>님 로그인
	<br>

	<a href="<%=request.getContextPath()%>/SearchController">내 정보 수정</a>
	<br>
	
	<a href="<%=request.getContextPath()%>/LogoutController">로그아웃</a>
	<br>
	
	<a href="<%=request.getContextPath()%>/DelController">탈퇴</a>
	<br>

	<%
		} else {
	%>
	<h3>로그인 실패</h3>

	<a href="<%=request.getContextPath()%>/member/loginForm.jsp">로그인 폼</a>

	<%
		}
	%>

</body>
</html>