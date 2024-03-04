package com.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConnectivity {
private static Session session=null;
	public static Session CreateSession() {
		if(session==null) {
			Configuration cfg=new Configuration();
			cfg.configure();
			
			SessionFactory sf=cfg.buildSessionFactory();
			
			session=sf.openSession();
		}
		return session;
	} 
		
}
