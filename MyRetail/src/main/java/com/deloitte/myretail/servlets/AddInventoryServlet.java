package com.deloitte.myretail.servlets;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deloitte.myretail.dao.InventoryDao;
import com.deloitte.myretail.entities.Inventory;
import com.deloitte.myretail.helper.FactoryProvider;

/**
 * Servlet implementation class AddInventoryServlet
 */
public class AddInventoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddInventoryServlet() {
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
		
		InventoryDao idao = new InventoryDao(FactoryProvider.getFactory());
			
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
		
			String op = request.getParameter("operation");
			
			if(op.trim().equals("addInventory"))
			{
				String code = request.getParameter("code");
				String name = request.getParameter("name");
				String quantity = request.getParameter("quantity");
				String price = request.getParameter("price");
				
				//code changes to check already
				Inventory already = new Inventory();
				already = idao.alreadyInserted(code);
				if(already!=null)
				{
					HttpSession httpSession = request.getSession();
					httpSession.setAttribute("message", "Inventory Code Already Existed!");
					response.sendRedirect("add.jsp");
				  
					return;
				}
				
				//till here code is changed
				
				Inventory inventory = new Inventory();	
			
				inventory.setCode(code);
				inventory.setName(name);
				inventory.setQuantity(quantity);
				inventory.setUnitPrice(price);
		
				idao.saveInventory(inventory);
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("message", "Inventory Added <br>");
				response.sendRedirect("index.jsp");

				return;
				
			}
			
		}
			catch (Exception e) {
			
			e.printStackTrace();
			}
		
		
		doGet(request, response);
	}
}
