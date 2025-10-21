<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	int a = (Integer)application.getAttribute("a");
	a++;
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
	</body>
</html>