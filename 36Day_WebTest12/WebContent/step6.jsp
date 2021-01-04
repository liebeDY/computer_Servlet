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
// String 배열 생성
String[] strings = {"aaa", "bbb", "ccc"};

// ArrayList 객체 생성 Member 객체 3개를 생성하여 members에 저장
ArrayList<Member> members = new ArrayList<Member>();
members.add(new Member("id1", "111", "name1", "email1"));
members.add(new Member("id2", "222", "name2", "email2"));
members.add(new Member("id3", "333", "name3", "email3"));

// 맵객체 생성, 생성한 맵에 name, tel, address키로 값을 저장한다
Map<String, String> map = new HashMap<String, String>();
map.put("name", "xxx");
map.put("tel", "111");
map.put("address", "대한민국");

%>

<c:set var="strings" value="<%=strings %>"/>
<c:set var="member" value="<%=members %>"/>
<c:set var="map" value="<%=map %>"/>


1 ~ 5 출력<br>
<c:forEach var="i" begin="1" end="5">
	${i }
</c:forEach>
<br><br>

1 ~ 5 사이의 숫자를 2씩 증가하여 출력 <br>
<c:forEach var="i" begin="1" end="5" step="2">
	${i }
	
</c:forEach>
<br><br>

String[] 에 저장된 데이터 출력 <br>
<c:forEach var="s" items="${strings }">
	${s }
</c:forEach>
<br><br>

ArrayList에 저장된 데이터 출력 <br>
<c:forEach var="m" items="${members }">
	id : ${m.id }, pwd : ${m.pwd }, name : ${m.name }, email : ${m.email }<br>
</c:forEach>
<br><br>

Map에 저장된 데이터 출력 <br>
<c:forEach var="m" items="${map }">
	${m },
</c:forEach>



</body>
</html>