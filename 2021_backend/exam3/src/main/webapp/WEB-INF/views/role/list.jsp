<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="R" value="/" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${R}common.css" />
</head>
<body>
	<div class="container">
		<c:forEach var="role" items="${ roles }">
			<h3>${ role.id }-${ role.title }</h3>

			<table class="list">
				<thead>
					<tr>
						<th>ID</th>
						<th>직원번호</th>
						<th>이름</th>
						<th>역할</th>
						<th>전화번호</th>
						<th>성별</th>
						<th>이메일</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="engineer" items="${ role.engineers }">
						<tr>
							<td>${ engineer.id }</td>
							<td>${ engineer.employeeNo }</td>
							<td>${ engineer.name }</td>
							<td>${ engineer.role.id }</td>
							<td>${ engineer.phone }</td>
							<td>${ engineer.sex }</td>
							<td>${ engineer.email }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:forEach>
	</div>
</body>
</html>

