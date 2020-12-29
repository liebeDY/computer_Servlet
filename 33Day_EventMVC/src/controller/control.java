package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Member;
import service.EventService;
import service.Service;

/**
 * Servlet implementation class control
 */
@WebServlet("/control")
public class control extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public control() {
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
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		String type = request.getParameter("type");
		String resultView = "event/";
		
		Service service = new EventService();
		
		if (type.equals("insert")) {
			Member m = new Member(id, email, pwd);
			service.insert(m);
			resultView = "control?type=list";
		} else if (type.equals("list")) {
			ArrayList<Member> data = service.list();
			request.setAttribute("data", data);
			resultView += "list.jsp";
		} else if (type.equals("editForm")) {
			int num = Integer.parseInt(request.getParameter("num"));
			Member m = service.getMember(num);
			request.setAttribute("member", m);
			resultView += "edit.jsp";
		} else if (type.equals("edit")) {
			int num = Integer.parseInt(request.getParameter("num"));
			Member m = new Member(num, id, email, pwd);
			service.edit(m);
			resultView = "control?type=list";
		} else if (type.equals("delete")) {
			int num =Integer.parseInt(request.getParameter("num"));
			service.delete(num);
			resultView = "control?type=list";
		}
			
			
		RequestDispatcher dis = request.getRequestDispatcher(resultView);
		dis.forward(request, response);
	}

}
