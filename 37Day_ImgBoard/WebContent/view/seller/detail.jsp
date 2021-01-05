<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script>
function a(){
	var flag = confirm("정말 삭제하겠습니까");
	
	if (flag) {
		document.f.action = "${pageContext.request.contextPath}/seller/Del?num=${p.num}";
		document.f.submit();
	} else {
		alert("삭제가 취소되었습니다");
	}
}

</script>



</head>
<body>

<form name="f" action="${pageContext.request.contextPath }/seller/Edit" method="post">

<table border=1>
	<tr>
		<th>상품명</th>
		<td>
			<input type="text" value="${p.name }" name="name">
		</td>
	</tr>
	
	
	<tr>
		<th>가격</th>
		<td>
			<input type="text" value="${p.price }" name="price">
		</td>
	</tr>
	
	<tr>
		<th>수량</th>
		<td>
			<input type="text" value="${p.quantity }" name="quantity">
		</td>
	</tr>
	
	<tr>
		<th>상품 이미지</th>
		<td> 
			${p.img } <br>
			<img src="${p.img }" width=300 height=300>
		</td>
	</tr>
	
	<tr>
		<th>상품상세설명</th>
		<td>
			<input type="text" value="${p.content }" name="content">
		</td>
	</tr>
	
	<tr>
		<td colspan=2>
			<input type="submit" value="수정">
			<input type="button" value="삭제" onclick="a()">
		</td>
	</tr>

</table>
<input type="hidden" name="num" value="${p.num }">
</form>
</body>
</html>