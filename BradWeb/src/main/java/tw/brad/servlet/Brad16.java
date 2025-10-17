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

		String x = (String)request.getAttribute("x");
		String y = (String)request.getAttribute("y");
		String result = (String)request.getAttribute("result");
		
		//-----------------------
		PrintWriter out = response.getWriter();
		
		String webContent;
		try {
			webContent = BradUtils.locaViewV2();
			out.printf(webContent, x, y, result);
		} catch (Exception e) {
			webContent = "ERROR Page";
			out.print(webContent);
		}
		
		
		response.flushBuffer();
	}

}
