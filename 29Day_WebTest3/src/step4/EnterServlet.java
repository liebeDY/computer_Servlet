package step4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.PersonVO;

/**
 * Servlet implementation class EnterServlet
 */
@WebServlet("/EnterServlet")
public class EnterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	// 입장한 사람 정보를 저장하는 list
	// 이 리스트는 init()에서 ServletContext 에 저장한다
	private ArrayList list = new ArrayList();
	
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		ServletContext context = this.getServletContext();
		// list는 주소값을 저장하고 있으므로 새로운 사람의 추가는 list.add()로 한다
		// 결국 list가 가리키는 주소값은 고정이지만 list의 객체에는 계속 추가된 인원이 증가한다
		context.setAttribute("table", list);
		System.out.println("init() list add");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(request.getParameter("nick") + "님 입장환영" + "<hr>");
		// list에 사람 객체 추가
		list.add(new PersonVO(request.getParameter("id"), request.getParameter("nick")));
		out.print("<a href=ListViewServlet>입장 명단 보기 </a>");
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
