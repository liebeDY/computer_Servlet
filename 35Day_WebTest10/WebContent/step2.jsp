<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="model.MemberVO,java.util.HashMap"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
1. scriptlet로 회원정보 출력하기<br>

<%
	MemberVO vo = (MemberVO) session.getAttribute("mvo"); 
%>

아이디 : <%=vo.getId() %>
이름 : <%=vo.getName() %>
메일 : <%=vo.getEmail() %> <br>


2. EL로 회원 정보 출력 <br>

아이디 : ${sessionScope.mvo.id }
이름 : ${sessionScope.mvo.name }
메일 : ${sessionScope.mvo.email }
<br>

2-1. EL로 회원 정보 출력<br>
아이디 : ${mvo.id }
이름 : ${mvo.name }
메일 : ${mvo.email }
<br>

<% String [] names = (String[])session.getAttribute("names"); %>
3.배열 출력 scriptlet <br>
<%=names[0] %>, <%=names[1] %>, <%=names[2] %>

4. 배열 출력 EL <br>
${sessionScope.names[0] },${sessionScope.names[1] },${sessionScope.names[2] }
<br>
4-1. 배열 출력 EL <br>
${names[0] },${names[1] },${names[2] }
<br>

<%
HashMap map = (HashMap)session.getAttribute("memMap");
MemberVO vo1 = (MemberVO)map.get("mem1");
MemberVO vo2 = (MemberVO)map.get("mem2");

%>

5. HashMap 출력 sciptlet<br>
map key : mem1 정보 이름 : <%=vo1.getName() %>
주소 : <%=vo1.getEmail() %> <br>

map key : mem2 정보 이름 : <%=vo2.getName() %>
주소 : <%=vo2.getEmail() %> <br>

6. HashMap 출력 EL <br>
map key : mem1 정보 이름 : ${sessionScope.memMap.mem1.name }
주소 : ${sessionScope.memMap.mem1.email }<br>

map key : mem2 정보 이름 : ${sessionScope.memMap.mem2.name }
주소 : ${sessionScope.memMap.mem2.email }<br>

6-1. HashMap 출력 EL<br>
map key : mem1 정보 이름 : ${memMap.mem1.name }
주소 : ${memMap.mem1.email }<br>

map key : mem2 정보 이름 : ${memMap.mem2.name }
주소 : ${memMap.mem2.email }<br>

</body>
</html>