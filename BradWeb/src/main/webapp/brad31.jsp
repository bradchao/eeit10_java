<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int a = 0;
	application.setAttribute("a", a);
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		a = ${a }<hr />
		<a href="brad32.jsp">Brad32</a>
	</body>
</html>