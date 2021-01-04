<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
	String[] strings = { "aaa", "bbb", "ccc", "ddd", "eee" };
%>

<c:set var="strings" value="<%=strings %>"/>

<table border=1>

<c:forEach var="s" items="${strings }" varStatus="status">
	<tr>
		<td>
			반복회수 : ${status.count }<br>
			<c:if test="${status.first }">
				첫 데이터 입니다
			</c:if>
			
			<c:if test="${status.last }">
				마지막 데이터 입니다
			</c:if>
				<br>
			${status.current }
		</td>
	</tr>


</c:forEach>
</table>


</body>
</html>