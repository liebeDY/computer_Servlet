package step2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDao;
import model.MemberVO;

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
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html; charset=euc-kr");
		response.setCharacterEncoding("euc-kr");
		PrintWriter out = response.getWriter();
		MemberDao dao = new MemberDao();
		// getParameter("membership") 에는 find.html 의 id 검색이 들어감
		ArrayList<MemberVO> list = dao.getFindMemberList(request.getParameter("membership"));
		
		// != 0 : 검색이 되면
		if (list.size() != 0) {
			out.print("<table border=1>");
			out.println("<td>Id</td><td>Name</td><td>Password</td><td>Address</td>");
			
			for (int i = 0; i < list.size(); i++) {
				out.print("<tr>");
				out.println("<td>" + list.get(i).getId() + "</td><td>" + list.get(i).getName() + "</td><td>" + list.get(i).getPassword() + "</td><td>" + list.get(i).getAddress() + "</td>");
				out.print("</tr>");
			}
			out.print("</table>");
			out.close();
		} else {
			out.print("찾는 구성원이 없습니다");
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
