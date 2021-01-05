package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;
import service.Service;
import service.ServiceImpl;

/**
 * Servlet implementation class EditController
 */
@WebServlet("/seller/Edit")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Service service = new ServiceImpl();
		
		Product p = new Product();
		
		p.setNum(Integer.parseInt(request.getParameter("num")));
		p.setName(request.getParameter("name"));
		p.setQuantity(Integer.parseInt(request.getParameter("quantity")));
		p.setPrice(Integer.parseInt(request.getParameter("price")));
		p.setContent(request.getParameter("content"));
		
		service.editProduct(p);
		response.sendRedirect("/ImgBoard/seller/List");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
