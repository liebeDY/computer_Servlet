<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	ArrayList<String> list1 = new ArrayList<String>();
	ArrayList<String> list2 = new ArrayList<String>();
	list2.add("aaa");
	list2.add("bbb");
	list2.add("ccc");
	
	int x = 10;
	int y = 20;
	
	pageContext.setAttribute("list1", list1);
	pageContext.setAttribute("list2", list2);
	pageContext.setAttribute("x", x);
	pageContext.setAttribute("y", y);
%>

list1�� ����°�? ${empty list1 } <br>
list2�� ����°�? ${empty list2 } <br>
list2 ������ : ${list2[0] } / ${list2[1] } / ${list2[2] }<br>

x = ${x } / y = ${y } <br>
x + y = ${x + y }
��Ģ���� �����ϴ�
</body>
</html>