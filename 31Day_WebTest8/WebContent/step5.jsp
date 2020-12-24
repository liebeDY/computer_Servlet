<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h3>구구단</h3>

<table border=1>

	<tr>
	<%	int i, j;
		for (i = 2; i < 10; i++) { 
	%>
			<td><%= i %>단 </td>
		
	<%	} %>
	</tr>
	<%
		for (i =2; i < 10; i++) {
			out.print("<td>");
			for (j = 1; j < 10; j++) {
				out.print(i + " * " + j + " = " + (i * j) + "<br>");
			}
			out.print("</td>"); 
		}
	%>
	<tr>
	</tr>

</table>


</body>
</html>