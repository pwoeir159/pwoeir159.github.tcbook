package com.pw.tc.store.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pw.tc.store.pojo.Commodity;
import com.pw.tc.store.service.StoreService;
import com.pw.tc.store.service.StoreServiceImpl;

/**
 * Servlet implementation class SearchProduct
 */
@WebServlet("/SearchProduct")
public class SearchProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StoreService storeservice = new StoreServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//doPost(req, resp);
    	list(req, resp);
    	
    }
    
	/**
	 * �d�߰ӫ~��
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		request.setCharacterEncoding("UTF-8");
		String keyword = request.getParameter("keyword");		
		//1.�q�LService�d�ߥ������ӫ~
		List<Commodity> Slist = storeservice.existsCommodity(keyword);
		//2.������ӫ~�s��Request�줤
		request.setAttribute("Slist", Slist);
		//3.�ШD��o��Tcstore.jsp����
		RequestDispatcher rd = request.getRequestDispatcher("/Tcstore.jsp");
		try {
				rd.forward(request, response);
				return;
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.�q�LService�d�ߥ������ӫ~
		
		List<Commodity> AllList = storeservice.AllexistsCommodity();
		//2.������ӫ~�s��Request�줤
		request.setAttribute("Slist", AllList);
		
		//3.�ШD��o��Tcstore.jsp����
		RequestDispatcher rd = request.getRequestDispatcher("/Tcstore.jsp");
		try {
				rd.forward(request, response);
				return;
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
