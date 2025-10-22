<%@page import="tw.brad.apis.Bike"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	HashMap<String,Object> person = new HashMap<>();
	person.put("name", "Brad");
	person.put("age", 18);
	person.put("gender", true);
	Bike bike = new Bike();
	person.put("bike", bike);
	bike.upSpeed().upSpeed().upSpeed().upSpeed();
	
	pageContext.setAttribute("person", person);

%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		Name: ${person.name }<br />
		Age: ${person.age }<br />
		Bike: ${person.bike }<br />
	</body>
</html>