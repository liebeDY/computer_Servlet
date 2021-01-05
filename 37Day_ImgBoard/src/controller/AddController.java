package controller;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.Product;
import service.Service;
import service.ServiceImpl;

/**
 * Servlet implementation class AddController
 */
@WebServlet("/seller/Add")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Service service = new ServiceImpl();
		
		Product p = new Product();
		
		p.setNum(service.makeNum());
		
		String img = "";
		
		int maxSize = 1024 * 1024 * 10;                                               
		
		MultipartRequest multi = null;
		
		String uploadPath = "D:\\hdy\\computer_JSP\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\webapps\\img";
		
		try {
			// request, 파일저장경로, 용량, 인코딩 타입, 중복파일명에 대한 기본 정책
			multi = new MultipartRequest(request, uploadPath, maxSize, "utf-8", new DefaultFileRenamePolicy());
			p.setName(multi.getParameter("name"));
			p.setQuantity(Integer.parseInt(multi.getParameter("quantity")));
			p.setPrice(Integer.parseInt(multi.getParameter("price")));
			p.setContent(multi.getParameter("content"));
			
			// 전송한 전체 파일이름들을 가져옴
			Enumeration files = multi.getFileNames();
			
			while (files.hasMoreElements()) {
				
				// 파일 input에 지정한 이름을 가져옴
				String file1 = (String) files.nextElement();
				
				// 그에 해당하는 실제 파일 이름을 가져옴
				img = multi.getOriginalFileName(file1);
				
				// 파일 업로드
				File file = multi.getFile(file1);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		p.setImg("/img/" + img);
		
		service.add(p);
		response.sendRedirect("/37Day_ImgBoard/seller/List");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
