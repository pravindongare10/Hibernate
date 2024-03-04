package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class Test_Load {

	public static void main(String[] args) {
	Configuration cfg =new Configuration();
		
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Employee s=session.load(Employee.class, 1);
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAddr());
	}

	

}
