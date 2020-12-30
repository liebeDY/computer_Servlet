package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BoardDaoImpl implements BoardDao{
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public Statement stmt = null;
	public String jdbc_driver;
	public String jdbc_url;
	public ResultSet rs = null;
	
	public BoardDaoImpl() {
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
	public void insert(Article a) {
		con();
		String sql = "insert into board values(seq_board.nextval, ?, ?, sysdate, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, a.getPwd());
			pstmt.setString(2, a.getWriter());
			pstmt.setString(3, a.getContent());
			pstmt.executeUpdate();
			discon();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Article select(int num) {
		con();
		String sql = "select * from board where id = ?";
		Article m = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				m = new Article(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5));
			}
			discon();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return m;
	}

	@Override
	public ArrayList<Article> selectAll() {
		con();
		ArrayList<Article> list = new ArrayList<Article>();
		String sql = "select * from board order by num";
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				list.add(new Article(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5)));
			}
			discon();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void update(Article a) {
		con();
		String sql = "update board set pwd = ?, w_date = sysdate, content = ?, where num = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, a.getPwd());
			pstmt.setString(2, a.getContent());
			pstmt.setInt(3, a.getNum());
			pstmt.executeUpdate();
			discon();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int num) {
		con();
		String sql = "delete board where num = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			discon();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
