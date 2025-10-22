<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 


    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>

		<c:set var="rpp">10</c:set>
		<c:set var="page">${empty param.page?1:param.page }</c:set>
		<c:set var="start">${(page - 1) * rpp }</c:set>
		<c:set var="prev">${page == 1?1:page-1 }</c:set>
		<c:set var="next">${page+1 }</c:set>
		
			
		<sql:query var="rs" dataSource="jdbc/mysql">
			SELECT * FROM foods LIMIT ${start }, ${rpp }
		</sql:query>
	
	
		<h1>Brad Big Company</h1>
		<hr />
		<a href="?page=${prev }">Prev</a> | Page: ${page } | <a href="?page=${next }">Next</a>
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