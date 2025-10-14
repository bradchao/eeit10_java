package com.ispan.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.ispan.apis.BradUtils;
import com.ispan.apis.Member;
import com.ispan.apis.MemberDAO;
import com.ispan.apis.MemberDAOImpl;

public class Brad19 {
	public static void main(String[] args) {
		Connection conn = null;
		try{
			conn = BradUtils.getConnection();
			
			conn.setAutoCommit(false);
			MemberDAO dao = new MemberDAOImpl(conn);
			Member m1 = dao.findById(4);
			Member m2 = dao.findById(5);
			
			m1.setName("test3");
			dao.updateMember(m1);
			
			System.out.println(10 /0);
			
			m2.setName("test4");
			dao.updateMember(m2);
			
			conn.commit();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e);
			if (conn != null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					System.out.println(e1);
				}
			}
		}finally {
			if (conn!= null) {
				try {
					conn.setAutoCommit(true);
				} catch (SQLException e) {
					System.out.println(e);
				}
			}
		}
		
		
	}

}
