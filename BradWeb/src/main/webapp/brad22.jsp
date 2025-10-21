<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="member" class="tw.brad.apis.Member" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="member"/>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		Member: <%= member.getAccount() %>:<%= member.getPasswd() %>:<%= member.getName() %><br />
		Member:
			<jsp:getProperty property="account" name="member"/> :
			<jsp:getProperty property="passwd" name="member"/> :
			<jsp:getProperty property="name" name="member"/>
		<hr />		
	</body>
</html>