<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//request.getLocale().getDisplayCountry()
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		Method: ${pageContext.request.method }<br />
		Locale: ${pageContext.request.locale }<br />
		Country: ${pageContext.request.locale.displayLanguage }<br />
		Country: ${pageContext.request.locale.language }<br />
	</body>
</html>