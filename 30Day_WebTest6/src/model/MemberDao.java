package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao {
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
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public ArrayList<MemberVO> getAllMemberList() {
		con();
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		try {
			String sql = "select id, password, name, address from member";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				list.add(new MemberVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return list;
	}
	
	public ArrayList<MemberVO> getFindMemberList(String id) {
		con();
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		try {
			String sql = "select id, password, name, address from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				list.add(new MemberVO(id, rs.getString(1), rs.getString(2), rs.getString(3)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return list;
	}
	
	public void addMemberList(MemberVO vo) {
		con();
		try {
			String sql = "insert into member(id, password, name, address) values(?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getAddress());
			// result 에는 update 된 개수가 들어감 -> 1
			int result = pstmt.executeUpdate();
			System.out.println("insert : " + result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
	}
	
	public ArrayList<MemberVO> LoginMemberList(String id, String pass) {
		con();
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		try {
			String sql = "select name, address from member where id = ? and password = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				list.add(new MemberVO(id, pass, rs.getString(1), rs.getString(2)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return list;
	}
}
