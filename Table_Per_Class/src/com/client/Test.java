package com.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Akurdi;
import com.model.Karvenager;
import com.utility.HibernateConnectivity;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateConnectivity.CreateSession();
		
		
		Karvenager c=new Karvenager();
		c.setSid(1);
		c.setSname("Pravin");
		c.setCoursename("Java");
		c.setRegularBatch("karvenager");
		
		Akurdi d=new Akurdi();
		d.setSid(2);
		d.setSname("Prashant");
		d.setCoursename("Java");
		d.setWeekendBatch("Akkurdi");
		
		Transaction tx=session.beginTransaction();
		session.save(c);
		session.save(d);
		tx.commit();
		
			
	}
	
}
