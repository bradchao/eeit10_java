package tw.brad.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.brad.apis.Bike;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/brad11")
public class Brad11 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("brad12");
		
		request.setAttribute("x", 10);
		request.setAttribute("y", 3);
		
		Bike bike = new Bike();
		request.setAttribute("bike", bike);
		
		bike.upSpeed().upSpeed().upSpeed().upSpeed();
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>Brad Big Company</h1>");
		out.println("<hr />");
		out.println("<div>Hello, Brad</div>");
		dispatcher.include(request, response);
		out.println("<hr/>");
		response.flushBuffer();
	}

}
