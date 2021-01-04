<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="model.Member" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map, java.util.HashMap" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
// String �迭 ����
String[] strings = {"aaa", "bbb", "ccc"};

// ArrayList ��ü ���� Member ��ü 3���� �����Ͽ� members�� ����
ArrayList<Member> members = new ArrayList<Member>();
members.add(new Member("id1", "111", "name1", "email1"));
members.add(new Member("id2", "222", "name2", "email2"));
members.add(new Member("id3", "333", "name3", "email3"));

// �ʰ�ü ����, ������ �ʿ� name, tel, addressŰ�� ���� �����Ѵ�
Map<String, String> map = new HashMap<String, String>();
map.put("name", "xxx");
map.put("tel", "111");
map.put("address", "���ѹα�");

%>

<c:set var="strings" value="<%=strings %>"/>
<c:set var="member" value="<%=members %>"/>
<c:set var="map" value="<%=map %>"/>


1 ~ 5 ���<br>
<c:forEach var="i" begin="1" end="5">
	${i }
</c:forEach>
<br><br>

1 ~ 5 ������ ���ڸ� 2�� �����Ͽ� ��� <br>
<c:forEach var="i" begin="1" end="5" step="2">
	${i }
	
</c:forEach>
<br><br>

String[] �� ����� ������ ��� <br>
<c:forEach var="s" items="${strings }">
	${s }
</c:forEach>
<br><br>

ArrayList�� ����� ������ ��� <br>
<c:forEach var="m" items="${members }">
	id : ${m.id }, pwd : ${m.pwd }, name : ${m.name }, email : ${m.email }<br>
</c:forEach>
<br><br>

Map�� ����� ������ ��� <br>
<c:forEach var="m" items="${map }">
	${m },
</c:forEach>



</body>
</html>