package board;

import java.util.ArrayList;

public class BoardServiceImpl implements BoardService {
	
	private BoardDao dao;
	
	public BoardServiceImpl() {
		dao = new BoardDaoImpl();
	}
	
	@Override
	public void addArticle(Article a) {
		dao.insert(a);
	}

	@Override
	public Article getArticle(int num) {
		return dao.select(num);
	}

	@Override
	public ArrayList<Article> getAll() {
		return dao.selectAll();
	}

	@Override
	public void editArticle(Article a) {
		dao.update(a);
	}

	@Override
	public void delArticle(int num) {
		dao.delete(num);
	}
	
}
