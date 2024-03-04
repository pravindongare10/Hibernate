package com.client;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.model.Student;
import com.utility.HibernateConnectivity;

public class Test2 {

	public static void main(String[] args) {
		//Multiple SqlQuery
		Session session=HibernateConnectivity.CreateSession();
	
		System.out.println("+++InsertData+++");
		Query<Student>query2=session.getNamedNativeQuery("insertdata");
		
		query2.setParameter(0, 9);
		query2.setParameter(1,"Mitaleshsir");
		
		Transaction tx=session.beginTransaction();
		query2.executeUpdate();
		tx.commit();
		
		System.out.println("+++SingleData+++");
		Query<Student> query1=session.getNamedNativeQuery("Singledata");
		query1.setParameter(0, 1);
		Student s1=query1.getSingleResult();
		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
		
		session.clear();
		System.out.println("+++getAlldata+++");
		Query<Student>query=session.getNamedNativeQuery("getAlldata");
		query.getResultList().forEach(s->{
		System.out.println(s.getSid());
		System.out.println(s.getSname());
	});
		
	}

}
