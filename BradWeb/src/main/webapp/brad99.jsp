<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String start = request.getParameter("start");
	String rows = request.getParameter("rows");
	String cols = request.getParameter("cols");

	final int START = start == null? 2 : Integer.parseInt(start);
	final int ROWS = rows == null? 2 : Integer.parseInt(rows);
	final int COLS = cols == null? 4 : Integer.parseInt(cols);

%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		<form action="brad99.jsp">
			Start: <input type="number" name="start" value="<%= START %>" />
			Rows: <input type="number" name="rows" value="<%= ROWS %>" />
			Cols: <input type="number" name="cols" value="<%= COLS %>" />
			<input type="submit" value="Change" />
		</form>
		<hr />
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