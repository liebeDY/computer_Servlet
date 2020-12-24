package step3;

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
 * Servlet implementation class FindServlet
 */
@WebServlet("/FindServlet")
public class FindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindServlet() {
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
		
		Product list = dao.getFindProductList(request.getParameter("membership"));
		
		if (list != null) {
			out.print("<form action='UpdateServlet' method=post>");
			out.print("<table border=1>");
			out.println("<td>pno </td><td>pname</td><td>pmaker</td><td>pprice</td><td>pdetail</td><td>edit</td>");
			out.print("<tr>");
			out.println("<td><input type=text name=pno readonly value='" + list.getPno() 
						+ "'></td><td><input type=text name=pname value='"+ list.getPname()
						+ "'></td><td><input type=text name=pmaker value='" + list.getPmaker()
						+ "'></td><td><input type=text name=pprice value='" + list.getPprice()
						+ "'></td><td><input type=text name=pdetail value='" + list.getPdetail()
						+ "'></td>");
			out.print("<td><input type=submit value=edit>");
			out.print("</tr>");
			
			out.print("</table>");
			out.print("</form>");
		} else {
			out.print("찾는 상품이 없습니다.");
		}
	}
}