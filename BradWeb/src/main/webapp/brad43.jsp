<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 

<sql:query var="rs" dataSource="jdbc/mysql">
	SELECT * FROM foods LIMIT 10
</sql:query>

    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		<h1>Brad Big Company</h1>
		<hr />
		<a href="">Prev</a> | Page: 2 | <a href="">Next</a>
		<hr />
		<table width="100%" border="1">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Tel</th>
				<th>Address</th>
			</tr>
			<c:forEach items="${rs.rows }" var="food">
				<tr>
					<td>${food.id }</td>
					<td>${food.name }</td>
					<td>${food.tel }</td>
					<td>${food.addr }</td>
				</tr>
			</c:forEach>
		</table>
		
		
	</body>
</html>