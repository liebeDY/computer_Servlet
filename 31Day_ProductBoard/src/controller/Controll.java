package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProductVO;
import service.EventService;

/**
 * Servlet implementation class Controll
 */
@WebServlet("/Controll")
public class Controll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controll() {
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
		
		// insert.jsp 의 form 경로
		String type = request.getParameter("type");
		// WebContent 의 board 폴더
		String resultView = "board/";
		
		EventService service = new EventService();
		
		if (type.equals("insert")) {
			String pname = request.getParameter("pname");
			String pmaker = request.getParameter("pmaker");
			String pprice = request.getParameter("pprice");
			String pdetail = request.getParameter("pdetail");
			
			ProductVO vo = new ProductVO(0, pname, pmaker, pprice, pdetail);
			service.insert(vo);
			resultView += "index.jsp";
		} else if (type.equals("list")) {
			ArrayList<ProductVO> data = service.list();
			request.setAttribute("data", data);
			resultView += "list.jsp";
		}
		RequestDispatcher dis = request.getRequestDispatcher(resultView);
		dis.forward(request, response);
	}
}
