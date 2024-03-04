  package com.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Account;
import com.model.Address;
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
			Address s=new Address();
			s.setPinno(42261);
			s.setCityname("Sangamner");
			s.setAreaname("Pangari");
			
			Account s1=new Account();
			s1.setAcno(1234);
			s1.setAcname("Pravin Dongare");
			s1.setAdr(s);
			
			Person s2=new Person();
			s2.setPname("Pravin");
			s2.setAc(s1);
			
			session.save(s2);
			tx.commit();
			break;
			case 2:
			Person p=session.get(Person.class,1001);
			System.out.println(p.getAc().getAdr().getPinno());
			System.out.println(p.getAc().getAdr().getCityname());
			System.out.println(p.getAc().getAdr().getAreaname());
			System.out.println(p.getAc().getAcno());
			System.out.println(p.getAc().getAcname());
			System.out.println(p.getPid());
			System.out.println(p.getPname());
				break;
			case 3:
			  Transaction tx1=session.beginTransaction();
			  	Person p1=session.load(Person.class,1001);
			  	p1.setPname("Rahul");
			  	session.update(p1);
			  	tx1.commit();
				break;
			case 4:
				  Transaction tx2=session.beginTransaction();
				  	Person p2=session.load(Person.class,1);
				  	p2.setPid(1);
				  	session.delete(p2);
				  	tx2.commit();
				break;
			case 5:
				System.exit(0);
				
			default:
				System.out.println("That is not a valid option,Please choose again.");	
		}
		
		}while(true);
	}
		

}
