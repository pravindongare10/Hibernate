package com.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;
import com.utility.HibernateConnectivity;

public class Test {

	public static void main(String[] args) {
		Session session=HibernateConnectivity.CreateSession();
		Transaction tx=session.beginTransaction();
		
		Student s=new Student();
		s.setSid(1);
		s.setSname("PD");
		
		session.save(s);
		tx.commit();
	}

}
