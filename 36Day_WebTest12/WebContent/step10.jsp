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

<h3>url�� import ���� 2</h3>

<c:url var="import_url" value="step11.jsp"></c:url>
<c:import url="${import_url }" var="content"></c:import>

import�� ������ ������ ��ū��(,) �� ���<br>

<c:forTokens var="str" items="${content }" delims="," varStatus="status">
${status.count }. ${str }<br>
</c:forTokens>

</body>
</html>