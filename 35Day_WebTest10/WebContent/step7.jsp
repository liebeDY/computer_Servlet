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
pageContext.setAttribute("pageScope", "page data");
request.setAttribute("requestScope", "request data");
session.setAttribute("sessionScope", "session data");
application.setAttribute("applicationScope", "application data");

%>

현재 프로그램의 기본 경로 : ${pageContext.request.contextPath } <br>
scope를 지정하지 않았을 때의 data 값 : ${data } <br>
scope를 pageContext 로 지정했을 때의 data 값 : ${pageScope.data } <br>
scope를 request 로 지정했을 때의 data 값 : ${requestScope.data } <br>
scope를 session 로 지정했을 때의 data 값 : ${sessionScope.data } <br>
scope를 application 로 지정했을 때의 data 값 : ${applicationScope.data } <br>
</body>
</html>