<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<script type="text/javascript">
function checkInsert(r) {
	
	if (r.pname.value == "") {
		alert("��ǰ���� �Է��ϼ���")
		r.pname.focus()
		return 
	} else if (r.pmaker.value == "") {
		alert("�����縦 �Է��ϼ���")
		r.pmaker.focus()
		return 
	} else if (r.pprice.value == "") {
		alert("������ �Է��ϼ���")
		r.pprice.focus()
		return 
	} else if (r.pdetail.value == "") {
		alert("��ǰ������ �Է��ϼ���")
		r.pdetail.focus()
		return 
	}
	r.submit()
}

</script>

</head>
<body>

<form name="x" action="<%=request.getContextPath() %>/Controll?type=insert" method="post">
<table>
	<tr>
		<td>��ǰ�� : <input type="text" name="pname"> <br><br> </td>
	</tr>

	<tr>
		<td>������ : <input type="text" name="pmaker"> <br><br> </td>
	</tr>
	
	<tr>
		<td>���� : <input type="text" name="pprice"> <br><br> </td>
	</tr>
	
	<tr>
		<td>������ : <textarea rows=5 name="pdetail" cols=40></textarea> </td>
	</tr>
</table>

<input type="button" onclick="checkInsert(this.form)" value="��ǰ�Է�">

</form>

</body>
</html>