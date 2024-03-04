package com.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Course;
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
			Transaction tx=session.beginTransaction();
			   Student a=new Student();
			   a.setSid(1);
			   a.setSname("Pravin");
			   
			   Student b=new Student();
			   b.setSid(2);
			   b.setSname("Swap");
			   
			   Course java=new Course();
			   
			   java.setCid(100);
			   java.setCname("java");
			   
			   Course python=new Course();
			   python.setCid(200);
			   python.setCname("python");
			   
			   a.getCourse().add(java);
			   a.getCourse().add(python);
			   
			   b.getCourse().add(java);
			   
			   java.getStu().add(a);
			   java.getStu().add(b);
			   
			   python.getStu().add(a);
			   
			   session.save(a);
			   session.save(b);
			   
			   session.save(python);
			   session.save(java);
			tx.commit();
			break;
			case 2:
				Student s1=session.get(Student.class,1);
		
				
				break;
			case 3:
			  
				break;
			case 4:
				 
				break;
			case 5:
				System.exit(0);
				
			default:
				System.out.println("That is not a valid option,Please choose again.");	
		}
		
		}while(true);
	}
	
}
