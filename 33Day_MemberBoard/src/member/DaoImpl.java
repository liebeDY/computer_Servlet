package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoImpl implements Dao {
	
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public Statement stmt = null;
	public String jdbc_driver;
	public String jdbc_url;
	public ResultSet rs = null;
	
	public DaoImpl() {
		jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	}
	
	public void con() {
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
				rs.close();;
			}
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
	
	@Override
	public void insert(Member m) {
		con();
		String sql = "insert into member values(?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPwd());
			pstmt.setString(3, m.getName());
			pstmt.setString(4, m.getEmail());
			pstmt.executeUpdate();
			discon();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Member select(String id) {
		con();
		String sql = "select * from member where id = ?";
		Member m = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				m = new Member(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
			return m;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return null;
	}

	@Override
	public void update(Member m) {
		con();
		String sql = "update member set pwd = ?, email = ? where id = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getPwd());
			pstmt.setString(2, m.getEmail());
			pstmt.setString(3, m.getId());
			pstmt.executeUpdate();
			discon();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String id) {
		con();
		String sql = "delete member where id = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			discon();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean checkId(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Member> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
