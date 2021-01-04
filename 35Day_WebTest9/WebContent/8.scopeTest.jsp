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
session.removeAttribute("sessionScope");
String myPage = (String) pageContext.getAttribute("pageScope");
String myrequest = (String) request.getAttribute("requestScope");
String mysession = (String) session.getAttribute("sessionScope");
String myApplication = (String) application.getAttribute("applicationScope");

%>

pageScope = <%=myPage %> <br>
requestScope = <%=myrequest %> <br>
sessionScope = <%=mysession %> <br>
applicationScope = <%=myApplication %> <br>
</body>
</html>