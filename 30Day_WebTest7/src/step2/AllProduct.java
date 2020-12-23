package step2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;
import model.ProductDao;

/**
 * Servlet implementation class AllProduct
 */
@WebServlet("/AllProduct")
public class AllProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllProduct() {
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
		
		ProductDao dao = new ProductDao();
		ArrayList<Product> list = dao.getProductAll();
		
		out.print("<table border=1>");
		out.println("<td>pno</td><td>pname</td><td>pmaker</td><td>pprice</td><td>pdetail</td>");
		
		for (int i = 0; i < list.size(); i++) {
			out.print("<tr>");
			out.println("<td>" + list.get(i).getPno() + "</td><td>" + list.get(i).getPname() + "</td><td>" + list.get(i).getPmaker() + "</td><td>" + list.get(i).getPprice()+ "</td><td>" + list.get(i).getPdetail());
			out.print("</tr>");
		}
		out.print("</table>");
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
