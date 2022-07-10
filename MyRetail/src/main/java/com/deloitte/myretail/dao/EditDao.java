package com.deloitte.myretail.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.deloitte.myretail.entities.Inventory;

public class EditDao {
	
	
	private SessionFactory factory;

	public EditDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}



	public void editInventory(Inventory cat)
	{
		Session session = this.factory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(cat);
		txn.commit();
		session.close();
		
		//catId;
	}

}
