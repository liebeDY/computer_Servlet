package step5;

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
 * Servlet implementation class ListViewServlet
 */
@WebServlet("/ListViewServlet")
public class ListViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// init() 에서 ServletContext로부터 list를 받아 할당한다
	private ArrayList list;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		ServletContext context = this.getServletContext();
		list = (ArrayList) context.getAttribute("table");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		if (list == null) {
			out.print("입장 명단이 없습니다");
		} else {
			int count = 1;
			out.print("<table border=1>");
			out.println("<td> 인원수 </td> <td> 아이디 </td> <td> 닉네임 </td>");
			
			for (int i = 0; i < list.size(); i++) {
				PersonVO vo = (PersonVO) list.get(i);
				out.print("<tr>");
				out.println("<td>" + count + "</td>");
				out.println("<td>" + vo.getId() + "</td>");
				out.println("<td>" + vo.getNick() + "</td>");
				out.print("</td>");
				count++;
			}
			out.print("</table>");
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
