<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Brad Big Company</h1>
		<hr />
		<div>Hello, World</div>
		<div>
			<% 
				out.println("Hello, World1<br />"); 
				out.println("Hello, World2<br />"); 
				out.println("Hello, World3<br />"); 
			%>
		</div>
	</body>
</html>