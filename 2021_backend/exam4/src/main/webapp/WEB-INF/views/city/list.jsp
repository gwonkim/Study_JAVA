<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my" %>
<c:url var="R" value="/" />
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <link rel="stylesheet" type="text/css" href="${R}common.css">
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="${R}common.js"></script>
  <style>
      form { margin-bottom: 5px; }
      a.btn { float: right; }
      td:nth-child(1), td:nth-child(6) { text-align: center; }
      td:nth-child(4) { text-align: right; }
  </style>
</head>
<body>
<div class="container">
  <h1>도시 목록</h1>
  <form:form method="get" modelAttribute="pagination">
    <form:hidden path="pg" value="1" />
    <form:hidden path="sz" />
    <span>국가:</span>
    <form:select path="ci" class="form-control">
      <form:option value="0">전체</form:option>
      <form:options itemValue="id" itemLabel="name" items="${ countries }" />
    </form:select>    
    <button type="submit" class="btn">검색</button>
    <a href="create?${pagination.queryString}" class="btn">도시등록</a>
  </form:form>
  
  <table class="list">
    <thead>
      <tr>
        <th>ID</th>
        <th>도시명</th>
        <th>지역</th>
        <th>인구</th>
        <th>국가</th>
        <th>수도</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="city" items="${ cities }">
        <tr data-url="edit?id=${city.id}&${pagination.queryString}">
          <td>${ city.id }</td>
          <td>${ city.name }</td>
          <td>${ city.district }</td>
          <td><fmt:formatNumber type="number" value="${city.population}" /></td>
          <td>${ city.country.name }</td>
          <c:if test="${ city.capital == false }">
        	<td>x</td>
      	  </c:if>
      	  <c:if test="${ city.capital == true }">
        	<td>수도</td>
      	  </c:if>
        </tr>
      </c:forEach>
    </tbody>
  </table>
  <my:pagination pageSize="${ pagination.sz }" recordCount="${ pagination.recordCount }" 
                 queryStringName="pg" />
</div>
</body>
</html>
