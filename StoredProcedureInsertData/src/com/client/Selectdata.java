package com.client;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;

import com.model.Student;
import com.utility.HibernateConnectivity;

public class Selectdata {

	public static void main(String[] args) {
		Session session=HibernateConnectivity.CreateSession();
		StoredProcedureQuery query=session.createStoredProcedureCall("selectdata",Student.class);
		List<Student>list=query.getResultList();
		for(Student o:list) {
			System.out.println(o.getSid());
			System.out.println(o.getSname());
		}
	}

}
