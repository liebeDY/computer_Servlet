<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="model.MemberVO,java.util.HashMap"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
MemberVO vo = new MemberVO("java", "abcd", "아이유", "안양");
session.setAttribute("mvo", vo);

String names[] = { "황정민", "조승우", "장동건" };
session.setAttribute("names", names);

HashMap map = new HashMap();
map.put("mem1", vo);

MemberVO vo1 = new MemberVO("jsp", "1234", "장동건", "서울");
map.put("mem2", vo1);
session.setAttribute("memMap", map);

%>

EL 첫번째 예제 <br>
<a href="step2.jsp">step2 에서 el 처리 확인하기</a>









</body>
</html>