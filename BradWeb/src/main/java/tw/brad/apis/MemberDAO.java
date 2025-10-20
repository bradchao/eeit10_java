package tw.brad.apis;

import java.util.List;

public interface MemberDAO {
	boolean addMember(Member member) throws Exception ;
	boolean updateMember(Member member) throws Exception ;
	boolean delMember(int id) throws Exception ;
	Member findById(int id) throws Exception ;
	List<Member> findAll() throws Exception ;
	Member login(String account, String passwd) throws Exception;
}
