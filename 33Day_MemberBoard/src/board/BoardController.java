package board;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BoardController
 */
@WebServlet("/BoardController")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html; charset=euc-kr");
		response.setCharacterEncoding("euc-kr");
		
		String type = "";
		String result = "";
		String writer = "";
		int num = 0;
		Article a = null;
		
		ArrayList<Article> list = new ArrayList<Article>();
		BoardService service = new BoardServiceImpl();
		HttpSession session = null;
		type = request.getParameter("type");
		
		if (type.equals("write")) {
			a = new Article();
			session = request.getSession(false);
			writer = (String) session.getAttribute("id");
			a.setWriter(writer);
			a.setPwd(request.getParameter("pwd"));
			a.setContent(request.getParameter("content"));
			service.addArticle(a);
			result = "/BoardController?type=boardList";
		} else if (type.equals("boardList")) {
			list = service.getAll();
			request.setAttribute("list", list);
			result = "board/list.jsp";
		} else if (type.equals("editForm")) {
			num = Integer.parseInt(request.getParameter("num"));
			System.out.println("controller1 num: " + num);
			a = service.getArticle(num);
			request.setAttribute("a", a);
			result = "board/editForm.jsp";
		} else if (type.equals("edit")) {
			a = new Article();
			num = Integer.parseInt(request.getParameter("num"));
			System.out.println("controller2 num : " + num );
			a.setNum(num);
			a.setPwd(request.getParameter("pwd"));
			a.setContent(request.getParameter("content"));
			service.editArticle(a);
			result = "/BoardController?type=boardList";
		} else if (type.equals("del")) {
			num = Integer.parseInt(request.getParameter("num"));
			service.delArticle(num);
			result = "/BoardController?type=boardList";
		}
		
		RequestDispatcher dis = request.getRequestDispatcher(result);
		dis.forward(request, response);
	}

}
