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
String subway = request.getParameter("subway");
int subwayNum = Integer.parseInt(subway);

if (subwayNum < 5) {
%>
	코레일 <%=subwayNum %> 호선 입니다.
<%
} else if (subwayNum < 10 && subwayNum >5) {
%>
	도시철도 <%=subwayNum %> 호선 입니다.
<%
}
%>
</body>
</html>