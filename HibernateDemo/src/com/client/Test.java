package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class Test {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Student s=new Student();
		s.setName("pravin");
		s.setRollno(1);
		
			session.save(s);
			session.beginTransaction().commit();
		
		
		
	}

}
