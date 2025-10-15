package tw.brad.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/brad04")
public class Brad04 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		String op = request.getParameter("op");
		System.out.println(op);
		try {
			int intX = Integer.parseInt(x);
			int intY = Integer.parseInt(y);
			System.out.println(intX + intY);
			
			//--------------------------------
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.printf("%s + %s = %d", x, y, (intX + intY));
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
	}

}
