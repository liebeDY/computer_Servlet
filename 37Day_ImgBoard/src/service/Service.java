package service;

import java.util.ArrayList;

import model.Product;

public interface Service {

	void add(Product p);
	
	Product getProduct(int num);
	
	void editProduct(Product p);
	void delProduct(int num);
	
	int makeNum();
	
	ArrayList<Product> getProductAll();
}
