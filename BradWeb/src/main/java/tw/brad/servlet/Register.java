package tw.brad.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.brad.apis.BradUtils;
import tw.brad.apis.Member;
import tw.brad.apis.MemberDAO;
import tw.brad.apis.MemberDAOImpl;

import java.io.IOException;
import java.sql.Connection;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private Connection conn;
	private MemberDAOImpl dao; 
	
    public Register() {
    	try {
			conn = BradUtils.getConnection();
			dao = new MemberDAOImpl(conn);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
    	
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String account = request.getParameter("account");
		String passwd = request.getParameter("passwd");
		String name = request.getParameter("name");
		
		Member member = new Member();
		member.setAccount(account);
		member.setPasswd(passwd);
		member.setName(name);
		
		try {
			Member m = dao.findByAccount(account);
			if (m == null) {
				if (dao.addMember(member)) {
					// success
					response.sendRedirect("brad15.jsp");
				}else {
					// failure
					response.sendRedirect("brad14.jsp?err=1");
				}
			}else {
				// exist
				response.sendRedirect("brad14.jsp?err=2");
			}
		} catch (Exception e) {
			// error
			System.out.println(e);
			response.sendRedirect("brad14.jsp?err=3");
		}
		
	
	}

}
