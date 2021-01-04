<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="model.MemberVO, java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
	String fa [] = {"구하라", "니콜", "한승연", "박규리", "강지영"};
	request.setAttribute("farray", fa);
%>

<h1>JSTL Loop</h1> <br>

1. scriptlet으로 배열 출력하기 <br>

<%
	String f [] = (String[]) request.getAttribute("farray");
	for (int i = 0; i < fa.length; i++) {
%>
		<%=i %> <%=fa[i] %>
<%
	}
%>
<hr>
<br>
<br>
2. Jstl 로 배열 출력하기 <br>
<%-- farray에 담긴 내용이 far에 하나씩 들어가서 출력 --%>

<c:forEach items="${requestScope.farray }" var="far" varStatus="vs">
${vs.count } ${far }
</c:forEach>
<hr>
<br>


<%
	ArrayList list = new ArrayList();
	list.add("구하라");
	list.add("니콜");
	list.add("한승연");
	list.add("강지영");
	list.add("박규리");
	request.setAttribute("kara", list);
%>
3. scriptlet 으로 ArrayList 요소 출력하기 <br>
<%
	ArrayList<MemberVO> klist = (ArrayList<MemberVO>) request.getAttribute("kara");
	for (int i = 0; i < klist.size(); i++) {
%>
		<%=klist.get(i) %>
<%
	}
%>
<hr>
<br>

4. Jstl로 ArrayList 요소 출력하기 <br>
<c:forEach items="${requestScope.kara }" var="mem">
${mem }
</c:forEach>



</body>
</html>