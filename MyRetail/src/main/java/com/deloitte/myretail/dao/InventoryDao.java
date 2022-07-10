package com.deloitte.myretail.dao;

import com.deloitte.myretail.entities.Inventory;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class InventoryDao {
	
	private SessionFactory factory;

	public InventoryDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}
	
	
	
	public Inventory getSearchItem(String search)
	{
		
		Inventory inventory = null;
		
		try {
			//HQl - Hibernate Query language
			String query = "from Inventory where code=: c";
			Session session = this.factory.openSession();
			Query q = session.createQuery(query);
			q.setParameter("c", search);
			
			inventory = (Inventory) q.uniqueResult();
			session.close();
		} 

		catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
		return inventory;

		
	}
	
	
	public List<Inventory> getItem()
	{
		Session session = this.factory.openSession();
		Query query = session.createQuery("from Inventory");
		List resultList = query.getResultList();
		session.close();
		return resultList;
		
	}
	
	
	public void saveInventory(Inventory cat)
	{
		Session session = this.factory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(cat);
		txn.commit();
		session.close();
		
		//catId;
	}	
	
	  public Inventory editInventory(String code) {
		
		  Inventory inventory = null;
			
			try {
				//HQl - Hibernate Query language
				String query = "from Inventory where code=: c";
				Session session = this.factory.openSession();
				Query q = session.createQuery(query);
				q.setParameter("c", code);
				
				inventory = (Inventory) q.uniqueResult();
				session.close();
			} 

			catch (Exception e) {
				e.printStackTrace();
				
			}
			
			
			return inventory;
		  
	  
	  }
	  
//	  code changes to do that already inserted inventory
	  public Inventory alreadyInserted(String code)
	  {
		  Inventory inventory = null; 
			
			try {
				//HQl - Hibernate Query language
				String query = "from Inventory where code=: c";
				Session session = this.factory.openSession();
				Query q = session.createQuery(query);
				q.setParameter("c", code);
				
				inventory = (Inventory) q.uniqueResult();
				session.close();
			} 

			catch (Exception e) {
				e.printStackTrace();
				
			}
			
			
			return inventory;
		  
	  }
	 
	
}
