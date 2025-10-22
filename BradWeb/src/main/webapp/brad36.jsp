<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	//String[] names = {"Brad","Andy","Amy","Kevin","Tony","Peter"};
	//pageContext.setAttribute("names", names);
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		<c:set var="names" value="${['Brad','Andy','Amy','Kevin','Tony','Peter'] }"></c:set>
		names[3] = ${names[3] }<br />
	</body>
</html>