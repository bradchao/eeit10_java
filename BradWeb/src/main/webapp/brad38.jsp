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
	
		<c:catch var="err">
			<sql:setDataSource
				driver="com.mysql.cj.jdbc.Driver"
				url="jdbc:mysql://localhost:3306/iii"
				user="root"
				password="root" 
			/>
			<sql:update var="num1">
				UPDATE cust SET tel = '7654321' WHERE id > 9
			</sql:update>
			<sql:update var="num2">
				DELETE FROM cust WHERE id > 9
			</sql:update>
		</c:catch>
		Update: ${num1 }<br />
		Delete: ${num2 }<br />
		
	</body>
</html>