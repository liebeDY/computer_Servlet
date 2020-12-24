<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<script>
function checkSelect() {
	var subwayTxt = document.selectForm.subway
	if (subwayTxt.value == "") {
		alert('전철을 선택하세요')
	} else {
		document.selectForm.submit()
	}
}

</script>
</head>
<body>

<form method="get" action="step12.jsp" name="selectForm">
	<select name="subway" onchange="checkSelect()">
		<option value="">------</option>
<%
	for (int i = 1; i < 10; i++) {
%>
		<option value=<%=i %>> <%=i %>호선</option>
<%
	} 
%>
	</select>
</form>




</body>
</html>