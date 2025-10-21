<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	String mesg = "";
 	String err = request.getParameter("err");
 	if (err != null){
 		switch(err){
	 		case "1": mesg = "Register Failure"; break;
	 		case "2": mesg = "Account EXIST"; break;
	 		case "3": mesg = "ERROR"; break;
 		}
 	}
 %>   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
		<script>
			function checkForm(){
				//
				return true;
			}
		</script>
	</head>
	<body>
		<div><%= mesg %></div>
		<form action="Register" method="post" onsubmit="return checkForm();">
			Account: <input name="account" /><br />
			Password: <input type="password" name="passwd" /><br />
			Name: <input name="name" /><br />
			<input type="submit" value="Register" />
		</form>
	</body>
</html>