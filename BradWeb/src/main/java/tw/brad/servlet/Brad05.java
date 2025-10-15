package tw.brad.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/brad05")
public class Brad05 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("doGet");
		String account = request.getParameter("account");
		String passwd = request.getParameter("passwd");
		//String name = request.getParameter("name");
		//System.out.printf("%s : %s\n", account, passwd);
		
		String[] interests = request.getParameterValues("interest");
		if (interests != null) {
			for (String interest : interests) {
				System.out.println(interest);
			}
		}else {
			System.out.println("NO Interest");
		}
		
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("doPost");
		
		String account = request.getParameter("account");
		String passwd = request.getParameter("passwd");
		System.out.printf("%s : %s\n", account, passwd);
	}
	

}
