<%@page import="tw.brad.apis.Bike"%>
<%@page import="java.util.TreeSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = request.getParameter("name");
	if (name == null) name = "World";
	
	TreeSet<Integer> set = new TreeSet<>();
	while(set.size()<6)set.add((int)(Math.random()*49+1));
	
	Bike bike = new Bike();
	bike.upSpeed().upSpeed().upSpeed().upSpeed();
	
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div>Hello, <% out.print(name); %></div>	
		<div>Hello, <%= name %></div>	
		<div>Lottery: <%= (int)(Math.random()*49+1) %></div>
		<div>Lottery: <%= set %> </div>
		<div>Bike: <%= bike %></div>
	</body>
</html>