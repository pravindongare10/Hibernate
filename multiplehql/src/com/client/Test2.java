package com.client;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.model.Student;
import com.utility.HibernateConnectivity;

public class Test2 {

	public static void main(String[] args) {
		//Multiple Hql named Query
		Session session=HibernateConnectivity.CreateSession();
		
		System.out.println("+++SingleData+++");
		Query<Student>query1=session.getNamedQuery("getsingledata");
		query1.setParameter(0, 1);
		Student s1=query1.getSingleResult();
		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
		
		
		System.out.println("+++UpdateData+++");
		Query<Student>query2=session.getNamedQuery("UpdateData");
		query2.setParameter(0,"RD");
		query2.setParameter(1, 1);
		Transaction tx=session.beginTransaction();
		query2.executeUpdate();
		tx.commit();
		session.clear();
		
		
		System.out.println("+++getAlldata+++");
		Query<Student>query=session.getNamedQuery("getAlldata");
		query.getResultList().forEach(s->{
			System.out.println(s.getSid());
			System.out.println(s.getSname());
		});
		
	}

}
