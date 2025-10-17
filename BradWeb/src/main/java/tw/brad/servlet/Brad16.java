package tw.brad.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.brad.apis.BradUtils;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * View
 */
@WebServlet("/brad16")
public class Brad16 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String webContent;
		try {
			webContent = BradUtils.loadView();
		} catch (Exception e) {
			webContent = "ERROR Page";
		}
		
		
		PrintWriter out = response.getWriter();
		out.print(webContent);
		response.flushBuffer();
	}

}
