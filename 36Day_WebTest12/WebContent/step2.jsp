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

JSTL if 연습 <br><br>
<c:if test="true">
true 이므로 실행
</c:if>
<hr>

<c:if test="false">
	<script>
		alert('ggggg');
	</script>
</c:if>
<hr>

<a href="step2.jsp?command=java">현 페이지 호출 command 전달</a> <br>

${param.command }

<%-- param의 command 값이 java 이면 true 반환하여 수행 --%>

<c:if test="${param.command=='java' }">
	${parma.command } 이므로 if 수행
</c:if>
<hr>

<a href="step2.jsp?id=jstl&age=20">현 페이지 호출 id와 age전달</a><br>
EL로 id와 age를 출력...<br>
id : ${param.id } age : ${param.age }
<br>

<%-- 나이가 19세 이상이면 몇 세 이므로 성인 --%>

<c:if test="${param.age>=19 }">
${param.age }세 이므로 성인
</c:if>
<br>

<%-- id가 jstl이고 age가 20이면 id와 age를 출력 --%>
<c:if test="${param.age==20 && param.id =='jstl' }">
id : ${param.id } age : ${param.age }
</c:if>



</body>

</html>