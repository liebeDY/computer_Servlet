package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.DBConnect;
import model.Product;

public class DaoImpl implements Dao {

	private DBConnect db;
	
	public DaoImpl() {
		db = DBConnect.getInstance();
	}
	
	@Override
	public int selectNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insert(Product p) {

		Connection conn = db.getConnection();
		
		String sql = "insert into shop_product values(?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, p.getNum());
			pstmt.setString(2, p.getName());
			pstmt.setInt(3, p.getQuantity());
			pstmt.setInt(4, p.getPrice());
			pstmt.setString(5, p.getImg());
			pstmt.setString(6, p.getContent());
			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public Product select(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Product p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Product> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateQuantity(int q, int num) {
		// TODO Auto-generated method stub
		
	}

	
}
