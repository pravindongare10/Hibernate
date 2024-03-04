package com.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Akurdi;
import com.model.Karvenager;
import com.utility.HibernateConnectivity;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateConnectivity.CreateSession();
		Transaction tx=session.beginTransaction();
		Karvenager k=new Karvenager();
		k.setSid(1);
		k.setSname("Pravin");
		k.setCoursename("Java");
		k.setRegularBatch("karvenager");
		
		Akurdi aa=new Akurdi();
		aa.setSid(2);
		aa.setSname("Prashant");
		aa.setCoursename("Java");
		aa.setWeekendBatch("Akurdi"); 
		
		session.save(k);
		session.save(aa);
		
		tx.commit();
		
	}
}
