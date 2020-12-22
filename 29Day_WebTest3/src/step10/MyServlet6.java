package step10;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet6
 */
@WebServlet("/MyServlet6")
public class MyServlet6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet6() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request 객체에 정보 저장
		// 현재 요청에 대한 응답이 전달되기 전까지 유효
		request.setAttribute("requestInfo", "test1");
		
		// 현재 session 객체 획득
		HttpSession session = request.getSession();
		
		// session 에 정보 저장
		// 클라이언트와 연결이 끊길 때까지 유효
		session.setAttribute("sessionInfo", "test2");
		
		// ServletContext 객체 획득, 어플리케이션 전체에 대한 정보 공유
		ServletContext application = getServletContext();
		
		// application 객체에 저장
		// 이 어플리케이션이 종료할 때까지 모든 파일이 공유
		application.setAttribute("applicationInfo", "test3");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/MyServlet7");
		
		if (dispatcher != null) {
			dispatcher.forward(request, response);
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
