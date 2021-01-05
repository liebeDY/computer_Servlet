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
<h3>내가 등록한 상품</h3>
<a href="${pageContext.request.contextPath }/seller/AddForm">새 상품 등록</a>

<table border="1">
	<tr>
		<th>상품 번호</th>
		<th>상품 평</th>
	</tr>
	
	<c:forEach var="p" items="${products }">
	<tr>
		<td>${p.num }</td>
		<td>
			<a href="${pageContext.request.contextPath }/seller/detail?num=${p.num }">${p.name }</a>
		</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>