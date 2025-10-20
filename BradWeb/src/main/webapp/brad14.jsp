<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<form action="Register" method="post" onsubmit="return checkForm();">
			Account: <input name="account" /><br />
			Password: <input type="password" name="passwd" /><br />
			Name: <input name="name" /><br />
			<input type="submit" value="Register" />
		</form>
	</body>
</html>