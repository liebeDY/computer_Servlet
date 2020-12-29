package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class OracleDao implements Dao {
	
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public Statement stmt = null;
	public String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	public String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	public ResultSet rs = null;
	
	private static OracleDao sd = new OracleDao();
	
	private OracleDao() {
		
	}

	public static OracleDao getDao() {
		return sd;
	}
	
	@Override
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

	@Override
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

	@Override
	public void insert(Member m) {
		con();
		String sql = "insert into event values(event_seq.nextval, ?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getEmail());
			pstmt.setString(3, m.getPwd());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			discon();
		}
	}

	@Override
	public ArrayList<Member> getAll() {
		con();
		ArrayList<Member> list = new ArrayList<Member>();
		String sql = "select * from event order by num";
		
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int num = rs.getInt(1);
				String id = rs.getString(2);
				String email = rs.getString(3);
				String pwd = rs.getString(4);
				Member m = new Member(num, id, email, pwd);
				list.add(m);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return list;
	}

	@Override
	public Member getMember(int num) {
		con();
		String sql = "select * from event where num = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int num2 = rs.getInt("num");
				String id = rs.getString("id");
				String email = rs.getString("email");
				String pwd = rs.getString("pwd");
				Member m = new Member(num2, id, email, pwd);
				return m;
			}
		} catch (Exception e) {
			System.out.println(e);
			return null;
		} finally {
			discon();
		}
		
		return null;
	}

	@Override
	public void update(Member m) {
		con();
		String sql = "update event set email = ?, pwd = ? where num = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getEmail());
			pstmt.setString(2, m.getPwd());
			pstmt.setInt(3, m.getNum());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			discon();
		}
	}

	@Override
	public void delete(int num) {
		con();
		String sql = "delete event where num = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			discon();
		}
 	}

}
