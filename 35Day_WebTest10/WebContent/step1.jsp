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
MemberVO vo = new MemberVO("java", "abcd", "������", "�Ⱦ�");
session.setAttribute("mvo", vo);

String names[] = { "Ȳ����", "���¿�", "�嵿��" };
session.setAttribute("names", names);

HashMap map = new HashMap();
map.put("mem1", vo);

MemberVO vo1 = new MemberVO("jsp", "1234", "�嵿��", "����");
map.put("mem2", vo1);
session.setAttribute("memMap", map);

%>

EL ù��° ���� <br>
<a href="step2.jsp">step2 ���� el ó�� Ȯ���ϱ�</a>









</body>
</html>