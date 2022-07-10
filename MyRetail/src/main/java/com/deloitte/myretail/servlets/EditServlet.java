package com.deloitte.myretail.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Servlet implementation class editServlet
 */
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
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
	
		
		//EditDao edao = new EditDao(FactoryProvider.getFactory());
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
 
        SessionFactory factory = cfg.buildSessionFactory();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		try {
			
			String op = request.getParameter("operation2");
			
			if(op.trim().equals("editInventory"))
			{
				String[] code = request.getParameterValues("code");
				String name = request.getParameter("name2");
				String quantity = request.getParameter("quantity");
				String price = request.getParameter("price");

				
				Session session = factory.openSession();
				Transaction tx = session.beginTransaction();
				Query q = session.createQuery("update Inventory set quantity=: q , unitPrice=: p where code=: c");
		
				q.setParameter("q", quantity);
				q.setParameter("p", price);
				q.setParameter("c", name);
				int result = q.executeUpdate();
		        System.out.println("Student data Update Status=" + result);
		        
		        
		        tx.commit();
		        session.close();
		        factory.close();
		        HttpSession httpSession = request.getSession();
				httpSession.setAttribute("message", "Inventory Edited Successfully :)");
			
				response.sendRedirect("index.jsp");
				return;
				
			}
		}
			
			catch (Exception e) {
				
				out.println("<h3>Error</h3>");
				
				e.printStackTrace();
				}
		
		
		doGet(request, response);
		
	}

}
