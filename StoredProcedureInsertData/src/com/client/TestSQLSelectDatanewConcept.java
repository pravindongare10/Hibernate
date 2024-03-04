package com.client;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import com.model.Student;
import com.utility.HibernateConnectivity;

public class TestSQLSelectDatanewConcept {

	public static void main(String[] args) {
	Session session=HibernateConnectivity.CreateSession();
		
		String sql="select *from student";
		SQLQuery<Student> query=session.createSQLQuery(sql);
		query.addEntity(Student.class);
		List<Student> list=query.getResultList();
		for(Student o:list) {
			System.out.println(o.getSid());
			System.out.println(o.getSname());
		}

	}

}
