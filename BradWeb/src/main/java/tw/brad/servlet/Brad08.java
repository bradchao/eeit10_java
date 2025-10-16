package tw.brad.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.util.Collection;

@WebServlet("/brad08")
@MultipartConfig(location = "C:\\Users\\User\\git\\repository\\BradWeb\\src\\main\\webapp\\upload")
public class Brad08 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String account = request.getParameter("account");
		//---------------
		Collection<Part> parts = request.getParts();
		for (Part part : parts) {
			String type = part.getContentType();
			String sname = part.getSubmittedFileName();
			String name = part.getName();
			long size = part.getSize();			
			
			System.out.printf("%s:%s:%s:%d\n", name, type, sname, size);
		}
		
		
	}

}
