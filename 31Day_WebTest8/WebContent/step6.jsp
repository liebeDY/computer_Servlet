<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.ArrayList"	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%-- <%! %> : ��� ���� or ��� �޼��� ���ǽ� ����Ѵ�. --%>
<%!
public ArrayList getList() {
	ArrayList list = new ArrayList();
	list.add("�¿�");
	list.add("����");
	list.add("����");
	list.add("����");
	
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