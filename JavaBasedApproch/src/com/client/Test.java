package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.config.HibernateUtil;
import com.model.Student;

public class Test {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Student s=new Student();
		s.setSname("Pravin");
		
		session.save(s);
		session.beginTransaction().commit();
	}

}
