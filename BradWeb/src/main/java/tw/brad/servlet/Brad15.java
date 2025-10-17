package tw.brad.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.brad.apis.MyModel;

import java.io.IOException;

/**
 * Controller
 */
@WebServlet("/brad15")
public class Brad15 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		String view = request.getParameter("view");

		if (view == null) view = "view3";
		
		request.setAttribute("view", view);
		
		//----------------------------------------------
		try {
			MyModel myModel = new MyModel(x, y);
			String result = myModel.plus();
			
			request.setAttribute("x", x);
			request.setAttribute("y", y);
			request.setAttribute("result", result);
		}catch(Exception e) {
			request.setAttribute("x", "");
			request.setAttribute("y", "");
			request.setAttribute("result", "");			
		}
		
		//------------------------------------------
		RequestDispatcher dispatcher = request.getRequestDispatcher("brad17");
		
		response.setContentType("text/html; charset=UTF-8");
		dispatcher.forward(request, response);
		
	}

}
