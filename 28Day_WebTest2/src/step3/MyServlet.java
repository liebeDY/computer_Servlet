package step3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html; charset=euc-kr");
		response.setCharacterEncoding("euc-kr");
		PrintWriter out = response.getWriter();
		
		// 파라메터 이름으로 하나씩 출력
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String gender = request.getParameter("gender");
		String hobby[] = request.getParameterValues("hobby");
		String grade = request.getParameter("grade");
		String content = request.getParameter("content");
		
		out.print("<h3>파라메터 이름으로 하나씩 읽어서 출력</h3>");
		out.print("id : " + id + "<br>");
		out.print("pwd : " + pwd + "<br>");
		out.print("gender : " + gender + "<br>");
		for (int i = 0; i < hobby.length; i++) {
			out.print("hobby" + (i + 1) + " : " + hobby[i] + "<br>");
		}
		out.print("grade : " + grade + "<br>");
		out.print("content : " + content + "<br>");
		
		
		// 이름으로 검색
		Enumeration e = request.getParameterNames();
		
		out.print("<h3>이름으로 검색해서 출력</h3>");
		while (e.hasMoreElements()) {
			String name = (String) e.nextElement();
			
			if (name.equals("hobby")) {
				String[] values = request.getParameterValues(name);
				for (int i = 0; i < values.length; i++) {
					out.print(name + " : " + values[i] + "<br>");
				}
			} else {
				String value = request.getParameter(name);
				out.print(name + " : " + value + "<br>");
			} 
		}
		
		// Map으로 
		Map<String, String[]> map = request.getParameterMap();
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		String str = null;
		String str1[];
		out.print("<h3>Map으로 검색해서 출력</h3>");
		while (it.hasNext()) {
			str = it.next();
			str1 = map.get(str);
			
			for (int i = 0; i < str1.length; i++) {
				out.print(str + " : " + str1[i]);
			}
			out.print("<br>");
		}
	}

}
