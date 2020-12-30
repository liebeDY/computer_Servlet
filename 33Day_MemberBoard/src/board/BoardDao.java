package board;

import java.util.ArrayList;

public interface BoardDao {
	void insert(Article a);
	Article select(int num);
	ArrayList<Article> selectAll();
	void update(Article a);
	void delete(int num);
}
