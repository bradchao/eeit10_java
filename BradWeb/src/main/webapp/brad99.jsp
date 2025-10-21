<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	final int START = 1;
	final int ROWS = 3;
	final int COLS = 3;

%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		
		<table border="1" width="100%">
			<%
				for (int k=0; k<ROWS; k++){
					out.println("<tr>");
					for (int j=START; j<START+COLS; j ++){
						int newj = j + k * COLS;
						out.println("<td>");
						for (int i = 1; i<= 9; i++){
							int r = newj * i;
							out.println(String.format("%d x %d = %d<br />", newj, i, r));
						}
						out.println("</td>");
					}
					out.println("</tr>");
				}
			%>
		</table>
		
		
	</body>
</html>