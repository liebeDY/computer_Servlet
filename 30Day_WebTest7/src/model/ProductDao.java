package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDao {

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public void con() {
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "hr", "hr");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void discon() {
		try {
			if (rs != null) {
				rs.close();
			}
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// 제품 추가
	public void ProductInsert(Product vo) {
		con();
		try {
			String sql = "insert into p_product (pno, pname, pmaker, pprice, pdetail) values(s_pno.nextval, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getPname());
			pstmt.setString(2, vo.getPmaker());
			pstmt.setString(3, vo.getPprice());
			pstmt.setString(4, vo.getPdetail());
			
			int result = pstmt.executeUpdate();
			System.out.println("insert : " + result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
	}
	
//	 전체 정보
	public ArrayList<Product> getProductAll() {
		con();
		ArrayList<Product> list = new ArrayList<Product>();
		
		try {
			String sql = "select * from p_Product";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return list;
	}
	
	// 제품 업데이트
//	public void productUpdate(Product vo) {
//		
//	}
}
