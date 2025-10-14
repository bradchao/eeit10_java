package com.ispan.apis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAOImpl implements MemberDAO{
	private final Connection conn;
	private final String SQL_ADD = """
			INSERT INTO member (account,passwd,name) VALUES (?,?,?)
			""";
	private final String SQL_UPDATE = """
			UPDATE member SET account = ?, passwd = ?, name = ? WHERE id = ?
			""";
	private final String SQL_DELETE = """
			DELETE FROM member WHERE id = ?
			""";
	private final String SQL_FIND_ID = """
			SELECT id, account, passwd, name FROM member WHERE id = ?
			""";
	private final String SQL_FIND_ALL = """
			SELECT id, account, passwd, name FROM member
			""";
	private final String SQL_FIND_ACCOUNT = """
			SELECT id, account, passwd, name FROM member
			WHERE account = ?
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
		try(PreparedStatement pstmt = conn.prepareStatement(SQL_UPDATE)) {
			pstmt.setString(1, member.getAccount());
			pstmt.setString(2, BCrypt.hashpw(member.getPasswd(), BCrypt.gensalt()));
			pstmt.setString(3, member.getName());
			pstmt.setInt(4, member.getId());
			int n = pstmt.executeUpdate();
			return n > 0;
		}		
	}

	@Override
	public boolean delMember(int id) throws Exception {
		try(PreparedStatement pstmt = conn.prepareStatement(SQL_DELETE)) {
			pstmt.setInt(1, id);
			int n = pstmt.executeUpdate();
			return n > 0;
		}		
	}

	@Override
	public Member findById(int id) throws Exception {
		try(PreparedStatement pstmt = conn.prepareStatement(SQL_FIND_ID)) {
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				Member member = new Member();
				member.setId(rs.getInt("id"));
				member.setAccount(rs.getString("account"));
				member.setPasswd(rs.getString("passwd"));
				member.setName(rs.getString("name"));
				return member;
			}
		}		
		return null;
	}

	@Override
	public List<Member> findAll() throws Exception {
		List<Member> members = new ArrayList<Member>();
		try(PreparedStatement pstmt = conn.prepareStatement(SQL_FIND_ALL)) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Member member = new Member();
				member.setId(rs.getInt("id"));
				member.setAccount(rs.getString("account"));
				member.setPasswd(rs.getString("passwd"));
				member.setName(rs.getString("name"));
				members.add(member);
			}
		}		
		return members;
	}
	
	private Member findByAccount(String account) throws Exception{
		try(PreparedStatement pstmt = conn.prepareStatement(SQL_FIND_ACCOUNT)) {
			pstmt.setString(1, account);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				Member member = new Member();
				member.setId(rs.getInt("id"));
				member.setAccount(rs.getString("account"));
				member.setPasswd(rs.getString("passwd"));
				member.setName(rs.getString("name"));
				return member;
			}
		}		
		return null;		
	}
	
	public Member login(String account, String passwd) throws Exception {
		Member member = findByAccount(account);
		if (member != null && BCrypt.checkpw(passwd, member.getPasswd())) {
			return member;
		}
		
		return null;
	}

}
