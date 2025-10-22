<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>      
<c:catch var="err">
	<sql:setDataSource
		driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/iii"
		user="root"
		password="root" 
	/>
	<sql:update var="n">
		UPDATE cust SET tel = ?, cname = ? WHERE id = ?
		<sql:param>${param.tel }</sql:param>
		<sql:param>${param.cname }</sql:param>
		<sql:param>${param.id }</sql:param>
	</sql:update>
</c:catch>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		<c:choose>
			<c:when test="${n > 0 }">Update Success</c:when>
			<c:otherwise>Failure</c:otherwise>
		</c:choose>
		
	</body>
</html>