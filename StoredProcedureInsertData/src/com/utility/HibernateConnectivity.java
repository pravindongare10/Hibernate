package com.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import config.HibernateUtil;

public class HibernateConnectivity {
private static Session session=null;
	public static Session CreateSession() {
		if(session==null) {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			 session=sf.openSession();
		}
		return session;
	} 
		
}
