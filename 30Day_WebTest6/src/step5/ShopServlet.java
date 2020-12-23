package step5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberDao;
import model.MemberVO;

/**
 * Servlet implementation class ShopServlet
 */
@WebServlet("/ShopServlet")
public class ShopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html; charset=euc-kr");
		response.setCharacterEncoding("euc-kr");
		PrintWriter out = response.getWriter();
		
		MemberDao dao = new MemberDao();
		
		// false = 기존에 있는 session 사용
		HttpSession session = request.getSession(false);
		
		// session 이 null : 로그인이 안되어있을 때
		if (session == null || session.getAttribute("userId") == null) {
			out.print("<script type='text/javascript'>");
			out.print("alert('아이디를 입력하세요')");
			out.print("location.href='login.html'");
			out.print("</script>");
		} else {
			ArrayList<MemberVO> list = (ArrayList) session.getAttribute("userId");
			out.print(list.get(0).getAddress() + " 에 사는 " + list.get(0).getName() + " 님 환영합니다");
			out.print("<hr><a href=LogoutServlet>로그아웃</a>");
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
