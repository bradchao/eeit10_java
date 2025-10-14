package com.ispan.apis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class MemberDAOImpl implements MemberDAO{
	private final Connection conn;
	private final String SQL_ADD = """
			INSERT INTO member (account,passwd,name) VALUES (?,?,?)"
			""";
	private final String SQL_UPDATE = """
			UPDATE member SET account = ?, passwd = ?, name = ? WHERE id = ?"
			""";
	
	public MemberDAOImpl (Connection conn) {
		this.conn = conn;
	}

	@Override
	public boolean addMember(Member member) throws Exception {
		try(PreparedStatement pstmt = conn.prepareStatement(SQL_ADD)) {
			pstmt.setString(1, member.getAccount());
			pstmt.setString(2, BCrypt.hashpw(member.getPasswd(), BCrypt.gensalt()));
			pstmt.setString(3, member.getName());
			int n = pstmt.executeUpdate();
			return n > 0;
		}
	}

	@Override
	public boolean updateMember(Member member) throws Exception {
		
	}

	@Override
	public boolean delMember(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
