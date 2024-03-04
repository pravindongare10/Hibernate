package com.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HibernateUtil;
import com.model.Student;


public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		Student s=new Student();
		
		System.out.println("Enter Sid");
		int a=sc.nextInt();
		s.setSid(a);
		System.out.println("Enter Sname");
		String b=sc.next();
		s.setSname(b);
		session.save(s);
		tx.commit();
	}

}
