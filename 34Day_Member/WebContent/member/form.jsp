<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>회원가입</h3>
	<form name="f"
		action="<%=request.getContextPath()%>/JoinController"
		method="post">
		<!-- <input type="hidden" name="type" value="join"> -->
		<table border="1">
			<tr>
				<td>id</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>pwd</td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>email</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="가입"> <input
					type="reset" value="취소"></td>
			</tr>
		</table>
	</form>
</body>
</html>