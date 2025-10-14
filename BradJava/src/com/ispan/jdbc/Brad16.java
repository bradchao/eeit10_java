package com.ispan.jdbc;

import java.sql.Connection;
import java.util.List;

import com.ispan.apis.BradUtils;
import com.ispan.apis.Member;
import com.ispan.apis.MemberDAO;
import com.ispan.apis.MemberDAOImpl;

public class Brad16 {
	public static void main(String[] args) {
		try(Connection conn = BradUtils.getConnection()){
			MemberDAO dao = new MemberDAOImpl(conn);
			
//			Member member = new Member();
//			member.setAccount("judy");
//			member.setPasswd("123456");
//			member.setName("茱蒂");
//			
//			if (dao.addMember(member)) {
//				System.out.println("Add OK");
//			}else {
//				System.out.println("Add XX");
//			}
			
//			Member m3 = dao.findById(3);
//			System.out.println(m3.getAccount() + ":" + m3.getName());
			
//			m3.setName("新湯尼");
//			dao.updateMember(m3);
			
//			dao.delMember(m3.getId());
			
			
			List<Member> members = dao.findAll();
			for (Member member : members) {
				System.out.printf("%d:%s:%s\n", member.getId(), member.getAccount(), member.getName());
			}
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
