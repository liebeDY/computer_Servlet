<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form action="${pageContext.request.contextPath }/seller/Add" method="post"
enctype="multipart/form-data">

��ǰ�� : 
	<input type="text" name="name"><br>
���� : 
	<input type="text" name="quantity"><br>
���� : 
	<input type="text" name="price"><br>

��ǰ �̹��� ��� :
	<input type="file" name="file"><br>
	
�󼼼��� : 
	<textarea rows="10" cols="30" name="content"></textarea><br>
<input type="submit" value="���">

</form>


</body>
</html>