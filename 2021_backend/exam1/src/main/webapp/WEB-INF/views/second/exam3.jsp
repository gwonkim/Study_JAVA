<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
table {
	border-collapse: collapse;
}

td {
	padding: 5px;
	width: 80px;
	border: 1px solid #000;
}

</style>
</head>

<body>
	<table>
		<tr>
			<td>이름</td>
			<td>${ name }</td>
		</tr>
		<tr>
			<td>학번</td>
			<td>${ studentNumber }</td>
		</tr>
	</table>
</body>
</html>

