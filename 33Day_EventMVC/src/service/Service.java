package service;

import java.util.ArrayList;

import model.Member;

public interface Service {
	void insert(Member m);
	void edit(Member m);
	ArrayList<Member> list();
	void delete(int num);
	Member getMember(int num);
}
