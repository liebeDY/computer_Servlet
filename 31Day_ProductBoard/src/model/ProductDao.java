package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDao {

	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public Statement stmt = null;
	public String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	public String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	public ResultSet rs = null;
	
	private static ProductDao sd = new ProductDao();
	
	private ProductDao() {
		
	}
	
	public static ProductDao getDao() {
		return sd;
	}
	
	public boolean con() {
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "hr", "hr");
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}
	
	public void discon() {
		try {
			if (stmt != null) {
				stmt.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (rs != null) {
				rs.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void insert(ProductVO p) {
		con();
		String sql = "insert into p_product values (s_pno.nextval, ?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getPname());
			pstmt.setString(2, p.getPmaker());
			pstmt.setString(3, p.getPprice());
			pstmt.setString(4, p.getPdetail());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			discon();
		}
	}
	
	public ArrayList<ProductVO> getAll() {
		con();
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		String sql = "select * from p_product order by pno";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int num = rs.getInt(1);
				String pname = rs.getString(2);
				String pmaker = rs.getString(3);
				String pprice = rs.getString(4);
				String pdetail = rs.getString(5);
				
				ProductVO m = new ProductVO(num, pname, pmaker, pprice, pdetail);
				list.add(m);
			}
		} catch (Exception e) {
			System.out.println(e);
			return null;
		} finally {
			discon();
		}
		return list;
	}
}
