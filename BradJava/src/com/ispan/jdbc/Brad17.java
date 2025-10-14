package com.ispan.jdbc;

import java.sql.Connection;
import java.util.List;

import com.ispan.apis.BradUtils;
import com.ispan.apis.Member;
import com.ispan.apis.MemberDAO;
import com.ispan.apis.MemberDAOImpl;

public class Brad17 {
	public static void main(String[] args) {
		try(Connection conn = BradUtils.getConnection()){
			MemberDAO dao = new MemberDAOImpl(conn);
			
			String account = "brad";
			String passwd = "123456";
			
			Member member = dao.login(account,passwd);
			if (member != null) {
				System.out.printf("Welcome, %s\n", member.getName());
			}else {
				System.out.println("get out here");
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
