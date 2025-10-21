<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String x = request.getParameter("x");
	String y = request.getParameter("y");
	request.setAttribute("lottery", (int)(Math.random()*49+1));
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		<div>Hello, World</div>
		<hr />
		<jsp:include page="brad17.jsp"></jsp:include>
		<hr />
		<jsp:include page="brad18.jsp"></jsp:include>
		<hr />
		<jsp:include page="brad19.jsp"></jsp:include>
		<hr />
	</body>
</html>