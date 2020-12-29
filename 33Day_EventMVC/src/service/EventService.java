package service;

import java.util.ArrayList;

import model.Dao;
import model.Member;
import model.OracleDao;

public class EventService implements Service {
	private Dao dao;
	
	public EventService() {
		dao = OracleDao.getDao();
	}
	
	
	@Override
	public void insert(Member m) {
		dao.insert(m);
	}

	@Override
	public void edit(Member m) {
		dao.update(m);
	}

	@Override
	public ArrayList<Member> list() {
		return dao.getAll();
	}

	@Override
	public void delete(int num) {
		dao.delete(num);
	}

	@Override
	public Member getMember(int num) {
		return dao.getMember(num);
	}

}
