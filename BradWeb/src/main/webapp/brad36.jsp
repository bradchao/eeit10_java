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
		names[3] = ${names[3] }<hr />
		
		<table border="1" width="100%">
			<tr>
				<th>Index</th>
				<th>Count</th>
				<th>Count</th>
				<th>First</th>
				<th>Last</th>
			</tr>
			<c:forEach items="${names }" var="name" varStatus="status" begin="1" end="4" step="2">
				<tr>
					<td>${status.index }</td>
					<td>${status.count }</td>
					<td>${name }</td>
					<td>${status.first }</td>
					<td>${status.last }</td>
				</tr>
			</c:forEach>
		</table>
		
	</body>
</html>