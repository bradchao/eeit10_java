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
	<sql:update var="num">
		INSERT INTO cust (cname,tel,birthday) VALUES 
		('test3','333','1999-01-02'),
		('test4','444','1999-01-02'),
		('test5','555','1999-01-02'),
		('test6','666','1999-01-02')
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
			<c:when test="${!empty err }">${err }</c:when>
			<c:otherwise>${num }</c:otherwise>
		</c:choose>
		
		
	</body>
</html>