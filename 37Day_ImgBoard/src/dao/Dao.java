package dao;

import java.util.ArrayList;

import model.Product;

public interface Dao {

	int selectNum();
	
	void insert(Product p);
	
	Product select(int num);
	
	void update(Product p);
	
	void delete(int num);
	
	ArrayList<Product> selectAll();
	
	void updateQuantity(int q, int num);
}
