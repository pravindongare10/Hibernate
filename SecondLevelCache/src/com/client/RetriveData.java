package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.config.HibernateUtil;
import com.model.Student;


public class RetriveData {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Student s=session.get(Student.class, 1);
		System.out.println(s.getSid());
		System.out.println(s.getSname());
		
		Student s1=session.get(Student.class, 1);
		System.out.println(s.getSid());
		System.out.println(s.getSname());
		
		Student s2=session.get(Student.class, 1);
		System.out.println(s.getSid());
		System.out.println(s.getSname());

		Session session1=sf.openSession();
		Student s3=session1.get(Student.class, 1);
		System.out.println(s.getSid());
		System.out.println(s.getSname());
		
		Student s4=session1.get(Student.class, 1);
		System.out.println(s.getSid());
		System.out.println(s.getSname());
	}

}
