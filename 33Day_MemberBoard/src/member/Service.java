package member;

import java.util.ArrayList;

public interface Service {
	void join(Member m);
	Member getMember(String id);
	void editMember(Member m);
	void delMember(String id);
	boolean checkId(String id);
	ArrayList<Member> getMembers();
	boolean login(String id, String pwd);
}
