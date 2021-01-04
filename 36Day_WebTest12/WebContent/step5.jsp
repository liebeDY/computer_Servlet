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
	String fa [] = {"���϶�", "����", "�ѽ¿�", "�ڱԸ�", "������"};
	request.setAttribute("farray", fa);
%>

<h1>JSTL Loop</h1> <br>

1. scriptlet���� �迭 ����ϱ� <br>

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
2. Jstl �� �迭 ����ϱ� <br>
<%-- farray�� ��� ������ far�� �ϳ��� ���� ��� --%>

<c:forEach items="${requestScope.farray }" var="far" varStatus="vs">
${vs.count } ${far }
</c:forEach>
<hr>
<br>


<%
	ArrayList list = new ArrayList();
	list.add("���϶�");
	list.add("����");
	list.add("�ѽ¿�");
	list.add("������");
	list.add("�ڱԸ�");
	request.setAttribute("kara", list);
%>
3. scriptlet ���� ArrayList ��� ����ϱ� <br>
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

4. Jstl�� ArrayList ��� ����ϱ� <br>
<c:forEach items="${requestScope.kara }" var="mem">
${mem }
</c:forEach>



</body>
</html>