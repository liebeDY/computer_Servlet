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

String myPage = (String) pageContext.getAttribute("pageScope");
String myrequest = (String) request.getAttribute("requestScope");
String mysession = (String) session.getAttribute("sessionScope");
String myApplication = (String) application.getAttribute("applicationScope");

%>

pageScope = <%=myPage %> <br>
requestScope = <%=myrequest %> <br>
sessionScope = <%=mysession %> <br>
applicationScope = <%=myApplication %> <br>


<a href="8.scopeTest.jsp">다음페이지로 이동</a>
</body>
</html>