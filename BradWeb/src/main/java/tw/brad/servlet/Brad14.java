package tw.brad.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.brad.apis.Bike;

@WebServlet("/brad14")
public class Brad14 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Integer x =  (Integer)request.getAttribute("x");
		Integer y =  (Integer)request.getAttribute("y");
		Bike bike = (Bike)request.getAttribute("bike");
		
		PrintWriter out = response.getWriter();
		out.print("<div>I am Brad14<div>");
		out.printf("%d + %d = %d<br />", x, y, (x+y));
		out.print(bike);
	}
}
