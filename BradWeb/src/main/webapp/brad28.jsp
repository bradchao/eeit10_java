<%@page import="tw.brad.apis.Bike"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = "Brad";
	pageContext.setAttribute("myName", name);
	
	Bike b1 = new Bike();
	pageContext.setAttribute("bike", b1);
	
	b1.upSpeed().upSpeed().upSpeed().upSpeed();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		MyName: ${myName }<br />
		Bike: ${bike }<br />
	</body>
</html>