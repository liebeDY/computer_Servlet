package service;

import java.util.ArrayList;

import dao.Dao;
import dao.DaoImpl;
import model.Product;

public class ServiceImpl implements Service {

	private Dao dao;
	
	public ServiceImpl() {
		this.dao = new DaoImpl();
	}
	
	@Override
	public void add(Product p) {
		dao.insert(p);
	}

	@Override
	public Product getProduct(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editProduct(Product p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delProduct(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int makeNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Product> getProductAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
