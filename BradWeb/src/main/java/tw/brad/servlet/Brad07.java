package tw.brad.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;

@WebServlet("/brad07")
@MultipartConfig(
		location = "C:\\Users\\User\\git\\repository\\BradWeb\\src\\main\\webapp\\upload"
		)
public class Brad07 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String ip = request.getRemoteAddr();
		System.out.print("ip:" + ip);
		
		Part part = request.getPart("upload");
		String type = part.getContentType();
		String sname = part.getSubmittedFileName();
		String name = part.getName();
		long size = part.getSize();

		try {
			System.out.println(sname);
			if (sname.indexOf('.') != -1) {
				String[] ss = sname.split("\\.");
				System.out.println(ss.length);
				part.write(ss[0] + "_" + ip + "." + ss[1]);
			}else {
				part.write(sname + "_" + ip);
			}
			System.out.println(":OK");
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(":ERR");
		}
		
		
	}
}
