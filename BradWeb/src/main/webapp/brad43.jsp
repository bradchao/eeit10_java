<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 

<sql:query var="rs" dataSource="jdbc/mysql">
	SELECT * FROM foods
</sql:query>

    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		
		<c:forEach items="${rs.rows }" var="food">
			${food.name }<br />
		</c:forEach>
		
		
	</body>
</html>