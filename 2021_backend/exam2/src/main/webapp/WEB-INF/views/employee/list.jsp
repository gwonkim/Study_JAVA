<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" type="text/css" href="/common.css" />
  <style>
    td:nth-child(1), td:nth-child(5), td:nth-child(7), td:nth-child(8) { text-align: center; }
  </style>
</head>
<body>
<div class="container">
  <h1>직원목록</h1>
  <table class="list">
    <thead>
      <tr>
        <th>id</th>
        <th>사번</th>
        <th>이름</th>
        <th>부서ID</th>
        <th>부서명</th>
        <th>월급</th>
        <th>성별</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="employee" items="${ employees }">
        <tr>
          <td>${ employee.id }</td>
          <td>${ employee.employeeNo }</td>
          <td>${ employee.name }</td>
          <td>${ employee.departmentId }</td>
          <td>${ employee.department.title }</td>
          <td>${ employee.salary }</td>
          <td>${ employee.sex }</td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
</div>
</body>
</html>
