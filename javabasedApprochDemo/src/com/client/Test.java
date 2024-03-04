package com.client;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;
import com.utility.HibernateConnectivity;

public class Test {

	public static void main(String[] args) {
		Session session=HibernateConnectivity.CreateSession();
		Scanner sc=new Scanner(System.in);
		do
		{	
			System.out.println("+++Choice is Yours:+++");
			System.out.println("1.Insert Values");
			System.out.println("2.Get value");
			System.out.println("3.Update value");
			System.out.println("4.delete value");
			System.out.println("5.Exit");
			int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			Student s=new Student();
			s.setSname("Pravin");
			session.save(s);
			session.beginTransaction().commit();
			
			break;
			case 2:
				Student s1=session.get(Student.class,1 );
				System.out.println(s1.getSid());
				System.out.println(s1.getSname());
				break;
			case 3:
			    Transaction tx = session.beginTransaction();
				Student s2=session.load(Student.class, 1);
				s2.setSname("Rahul");
				session.update(s2);
				tx.commit();
				break;
			case 4:
			    Transaction tx1 = session.beginTransaction();

				Student s4=session.load(Student.class, 1);
				
				session.delete(s4);
				tx1.commit();
				break;
			case 5:
				System.exit(0);
				
			default:
				System.out.println("That is not a valid option. Please choose again.");	
		}
		
		}while(true);
	}

}
