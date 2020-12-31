package service;

import dao.JoinDao;
import dao.JoinDaoImpl;
import model.Member;

public class JoinServiceImpl implements JoinService {

	private JoinDao dao;
	
	public JoinServiceImpl() {
		dao = new JoinDaoImpl();
	}
	
	@Override
	public void join(Member m) {
		dao.insert(m);
	}

	@Override
	public Member getMember(String id) {
		return dao.select(id);
	}

	@Override
	public void editMember(Member m) {
		dao.update(m);
	}

	@Override
	public void delMember(String id) {
		dao.delete(id);
	}

}
