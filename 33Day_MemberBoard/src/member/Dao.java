package member;

import java.util.ArrayList;

public interface Dao {

	void insert(Member m);
	Member select(String id);
	void update(Member m);
	void delete(String id);
	boolean checkId(String id);
	ArrayList<Member> selectAll();
}
