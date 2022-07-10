package com.deloitte.myretail.helper;

import java.io.PrintWriter;

import java.io.StringWriter;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {

	private static SessionFactory factory;
	
	private static final Logger logger = LogManager.getLogger(FactoryProvider.class);

	public static SessionFactory getFactory()
	{
		logger.info("I am getFactory method");
		try {
			PropertyConfigurator.configure("C:\\Users\\shubhamsahu\\Desktop\\kart2\\MyRetail\\src\\main\\resources\\log4j.properties");
		
			if(factory == null)
			{	
				logger.info("im start of if");
				factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				logger.info("Im end of if block");
			}
		
		} catch(Exception e){
			
			logger.error("Error in Initializing");
			
			StringWriter sw = new StringWriter(); //object creation
			e.printStackTrace(new PrintWriter(sw)); //wrapping
			logger.error(sw.toString());
		}
		logger.info("I am END of getFactory method");
		
		return factory;
		
	}
	
}
