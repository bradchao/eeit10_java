<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		<c:import 
			url="https://data.moa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelFood.aspx"
			var="data"></c:import>
		<c:set var="foods" value=""></c:set>
	
	</body>
</html>