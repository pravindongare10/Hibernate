 package com.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.model.AdharCard;
import com.model.Person;
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
			AdharCard s=new AdharCard();
			s.setAdharno(12345l);
			s.setAdharname("Pravin");
			
			Person s1=new Person();
			s1.setPid(1);
			s1.setPname("Pravin");
			s1.setAd(s);
			
			session.save(s1);
			tx.commit();
			break;
			case 2:
			Person p=session.get(Person.class,1);
			System.out.println(p.getPid());
			System.out.println(p.getPname());
			System.out.println(p.getAd().getAdharno());
			System.out.println(p.getAd().getAdharname());
				break;
			case 3:
			    Transaction tx1 = session.beginTransaction();
				Person s2=session.load(Person.class, 1);
				s2.setPname("Abc");
				session.update(s2);
				tx1.commit();
				break;
			case 4:
				  Transaction tx2 = session.beginTransaction();
					Person s3=session.load(Person.class, 1);
					s3.setPid(1);
					session.delete(s3);
					tx2.commit();
				break;
			case 5:
				System.exit(0);
				
			default:
				System.out.println("That is not a valid option. Please choose again.");	
		}
		
		}while(true);
	}
		
	

}
