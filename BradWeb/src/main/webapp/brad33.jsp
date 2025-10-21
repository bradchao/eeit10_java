<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Integer counter = (Integer)application.getAttribute("counter");
	if (counter == null){
		application.setAttribute("counter", 0);
	}else{
		counter++;
		application.setAttribute("counter", counter);
	}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		Counter = ${counter }
	</body>
</html>