
package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.model.abc;

public class Test {

	public static void main(String[] args) {
		
		Configuration cfg =new Configuration();
		
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		abc s=new abc();
		s.setId(1);
		s.setName("Rutvik");
		
		session.save(s);
		session.beginTransaction().commit();
	
	}

}
