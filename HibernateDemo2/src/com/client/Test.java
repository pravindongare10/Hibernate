package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class Test {

	public static void main(String[] args) {
		
		
		Configuration cfg =new Configuration();
		
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Employee s=new Employee();
		s.setId(1);
		s.setName("Nilesh");
		s.setAddr("Junnar");
		session.save(s);
		session.beginTransaction().commit();
	}

}
