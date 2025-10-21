<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	System.out.println(request.getMethod());
	if (request.getMethod().equals("POST")) response.sendError(403, "阿你來亂的嬤");
	
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		Account: ${param.account }<br />
		Hobby:<br />
		1. ${paramValues.hobby[0] }<br />
		2. ${paramValues.hobby[1] }<br />
		3. ${paramValues.hobby[2] }<br />
		4. ${paramValues.hobby[3] }<br />
		5. ${paramValues.hobby[4] }<br />
		6. ${paramValues.hobby[5] }<br />
		7. ${paramValues.hobby[100] }<br />
		8. ${paramValues.hobby[200] }<br />
		
		
		
	</body>
</html>