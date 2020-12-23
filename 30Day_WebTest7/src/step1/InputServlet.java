package step1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;
import model.ProductDao;

/**
 * Servlet implementation class InputServlet
 */
@WebServlet("/InputServlet")
public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InputServlet() {
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
		PrintWriter out = response.getWriter();
		
		ProductDao dao = new ProductDao();
		
		String pname = request.getParameter("pname");
		String pmaker = request.getParameter("pmaker");
		String pprice = request.getParameter("pprice");
		String pdetail = request.getParameter("pdetail");
		
		Product vo = new Product(0, pname, pmaker, pprice, pdetail);
		
		dao.ProductInsert(vo);
		out.print(pmaker + " "+ pname + " 상품이 등록되었습니다.<br>");
		out.print("<a href='index.html'>홈으로 돌아가기</a>");
		out.close();
	}

}
