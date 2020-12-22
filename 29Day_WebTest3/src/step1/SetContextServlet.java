package step1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetContextServlet
 */
@WebServlet("/SetContextServlet")
public class SetContextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetContextServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		// javax.servlet.ServletContext로 정의 되어 있다
		// 서블릿과 컨테이너 간의 연동을 위해 사용한다
		// 컨텍스트(웹 애플리케이션)마다 하나의 SErvletContext가 생성된다
		// 서블릿끼리 자원(데이트)을 공유하는데 사용한다
		// 컨테이너 실행시 생성되고 컨테이너 종료시 소멸된다
		ServletContext context = this.getServletContext();
		context.setAttribute("info", "손연재");
		out.print("ServletContext에 data setting");
		out.print("<a href=GetContextServlet>GetContextServlet으로 이동</a>");
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
