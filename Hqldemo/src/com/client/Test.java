package com.client;
 
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

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
			System.out.println("2.Retrive All Data");
			System.out.println("3.Retrive Single Object");
			System.out.println("4.Retrie Single Object Named Parameter");
			System.out.println("5.Update value");
			System.out.println("6.delete Data");
			System.out.println("0.Exit");
			int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
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
			break;
			case 2:
				//Retrive All Data
				//write hql query
				String hql="from Student";
				//create object of query
				Query<Student> query=session.createQuery(hql);
				List<Student> students=query.getResultList();
				for (Student student : students) {
					System.out.println(student.getSid()); 
					System.out.println(student.getSname());
				}
				break;
			case 3:
				//Retrive Single Object
			  String hql1="from Student where sid=?";
			  Query<Student>query1=session.createQuery(hql1);
			  query1.setParameter(0, 1);
			  
			  Student s1=query1.getSingleResult();
			  System.out.println(s1.getSid());
			  System.out.println(s1.getSname());
			break;
			
			case 4:
				
				//Retrive Single Object Named Parameter
				 String hql2="from Student where sid=:rollno";//1 bnamed parameter
				 Query<Student>query2=session.createQuery(hql2);
				  query2.setParameter("rollno", 1);
				  Student s2=query2.getSingleResult();
				  System.out.println(s2.getSid());   
				  System.out.println(s2.getSname());
				  
				break;
				
			case 5:
				//Update value
				Transaction tx1=session.beginTransaction();
				String hql3="Update Student set sname=:nm where sid=:id";
				Query<Student>query3=session.createQuery(hql3);
				query3.setParameter("nm", "Dongare");
				query3.setParameter("id", 1);
				query3.executeUpdate();
				tx1.commit();
				break;
				
			case 6:
				//delete Data
				Transaction tx2=session.beginTransaction();
				String hql4="delete from Student where sid=:id";
				Query<Student>query4=session.createQuery(hql4);
				query4.setParameter("id",1);
				query4.executeUpdate();
				tx2.commit();
				break;
			case 0:
				System.exit(0);
				
			default:
				System.out.println("That is not a val id option,Please choose again.");	
		}
		
		}while(true);
	}
	

}
