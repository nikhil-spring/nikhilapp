package com.Hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	
	private static SessionFactory factory;
	private HibernateUtil(){}
	
	public static synchronized SessionFactory getSessionFactory(){
		if(factory==null){
			factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			System.out.println("session factory created");
		}
		return factory;
		
	}
}


