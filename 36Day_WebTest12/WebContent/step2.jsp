<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

JSTL if ���� <br><br>
<c:if test="true">
true �̹Ƿ� ����
</c:if>
<hr>

<c:if test="false">
	<script>
		alert('ggggg');
	</script>
</c:if>
<hr>

<a href="step2.jsp?command=java">�� ������ ȣ�� command ����</a> <br>

${param.command }

<%-- param�� command ���� java �̸� true ��ȯ�Ͽ� ���� --%>

<c:if test="${param.command=='java' }">
	${parma.command } �̹Ƿ� if ����
</c:if>
<hr>

<a href="step2.jsp?id=jstl&age=20">�� ������ ȣ�� id�� age����</a><br>
EL�� id�� age�� ���...<br>
id : ${param.id } age : ${param.age }
<br>

<%-- ���̰� 19�� �̻��̸� �� �� �̹Ƿ� ���� --%>

<c:if test="${param.age>=19 }">
${param.age }�� �̹Ƿ� ����
</c:if>
<br>

<%-- id�� jstl�̰� age�� 20�̸� id�� age�� ��� --%>
<c:if test="${param.age==20 && param.id =='jstl' }">
id : ${param.id } age : ${param.age }
</c:if>



</body>

</html>