package com.client;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.model.Student;
import com.utility.HibernateConnectivity;

public class Test2 {

	public static void main(String[] args) {
		// getAlldata using single named hql Query
		Session session=HibernateConnectivity.CreateSession();
		Query<Student>query=session.getNamedNativeQuery("getAlldata");
		
		query.getResultList().forEach(s->{
			System.out.println(s.getSid());
			System.out.println(s.getSname());
		});
		
	}

}
