package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class Test_update {

	public static void main(String[] args) {
Configuration cfg =new Configuration();
		
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Employee s=new Employee();
		s.setId(1);
		s.setName("Swap");
		s.setAddr("Kotul");
		
		session.update(s);
		session.beginTransaction().commit();

	}

}
