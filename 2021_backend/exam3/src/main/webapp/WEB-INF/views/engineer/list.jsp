<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url var="R" value="/" />
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <link rel="stylesheet" type="text/css" href="${R}common.css" />
  <style>
    a.btn { float: right; margin: -20px 0 5px 0; }
    td:nth-child(1), td:nth-child(5) { text-align: center; }
  </style>
</head>
<body>
<div class="container">
  <h1>직원목록</h1>
  <table class="list">
    <thead>
      <tr>
        <th>id</th>
        <th>직원번호</th>
        <th>이름</th>
        <th>역할</th>
        <th>전화번호</th>
        <th>성별</th>
        <th>이메일</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="engineer" items="${ engineers }">
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
</div>
</body>
</html>
