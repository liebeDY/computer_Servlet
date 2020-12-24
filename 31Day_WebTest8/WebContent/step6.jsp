<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.ArrayList"	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%-- <%! %> : 멤버 변수 or 멤버 메서드 정의시 사용한다. --%>
<%!
public ArrayList getList() {
	ArrayList list = new ArrayList();
	list.add("태연");
	list.add("윤아");
	list.add("서현");
	list.add("유리");
	
	return list;
}
%>

<table border=1>
	<%	ArrayList list = getList();
		for (int i = 0; i < list.size(); i++) {
	%>
	<tr>
		<td>
			<%=i+1 %>
		</td>
		
		<td>
			<%=list.get(i) %>
		</td>
	
	</tr>
	<%	
		}
	%>
</table>


</body>
</html>