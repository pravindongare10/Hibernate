package com.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.utility.HibernateConnectivity;

public class TestSQLSelectDataoldConcept {

	public static void main(String[] args) {
		Session session=HibernateConnectivity.CreateSession();
		
		String sql="select *from student";
		Query query=session.createSQLQuery(sql);
		List<Object[]>list=query.getResultList();
		for(Object[]o:list) {
			System.out.println(o[0]);
			System.out.println(o[1]);
		}
	}

}
