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

상품명 : 
	<input type="text" name="name"><br>
수량 : 
	<input type="text" name="quantity"><br>
가격 : 
	<input type="text" name="price"><br>

상품 이미지 등록 :
	<input type="file" name="file"><br>
	
상세설명 : 
	<textarea rows="10" cols="30" name="content"></textarea><br>
<input type="submit" value="등록">

</form>


</body>
</html>