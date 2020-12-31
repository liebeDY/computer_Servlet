package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Member;
import service.JoinService;
import service.JoinServiceImpl;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
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
		
		JoinService service = new JoinServiceImpl();
		
		boolean flag = false;
		
		// 세션 생성
		HttpSession session = request.getSession();
	
		// 로그인에 필요한 요청 파라메터를 읽는다.
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		// id로 멤버 검색
		Member m = service.getMember(id);
		
		if (m != null && pwd.equals(m.getPwd())) {
			session.setAttribute("id", id);
			// 로그인 성공 여부를 flag 에 저장
			flag = true;
		}
		
		// 세션에 로그인 성공 여부를 저장
		session.setAttribute("flag", flag);
		
		RequestDispatcher dis = request.getRequestDispatcher("/member/result.jsp");
		if (dis != null) {
			dis.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
