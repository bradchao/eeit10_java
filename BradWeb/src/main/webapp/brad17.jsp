<%
	String x = request.getParameter("x");
	String y = request.getParameter("y");
	int lottery = (Integer)request.getAttribute("lottery");
%>
Brad17 Page<hr />
x = <%= x %><br />
y = <%= y %><br />
Lottery = <%= lottery %><br />
<hr />
