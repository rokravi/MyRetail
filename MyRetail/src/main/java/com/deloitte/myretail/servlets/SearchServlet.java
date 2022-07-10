package com.deloitte.myretail.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deloitte.myretail.dao.InventoryDao;
import com.deloitte.myretail.entities.Inventory;
import com.deloitte.myretail.helper.FactoryProvider;

/**
 * Servlet implementation class SearchServlet
 */
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		String search = request.getParameter("search");
		PrintWriter out = response.getWriter();
		
		List<Inventory> plist = null;
		
		HttpSession httpsession = request.getSession();
		response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		
		InventoryDao inventoryDao = new InventoryDao(FactoryProvider.getFactory());
		plist = inventoryDao.getItem();
		//Inventory inventory = inventoryDao.getItem();
		Inventory inventory1 = inventoryDao.getSearchItem(search);
		//System.out.println(inventory);
		out.println(inventory1);
		out.println(plist);
	
		
		
		doGet(request, response);
		
		
	}

}
