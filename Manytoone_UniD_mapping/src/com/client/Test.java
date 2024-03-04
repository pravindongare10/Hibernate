package com.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Department;
import com.model.Employee;
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
			
			Department hr=new Department();
			hr.setDid(111);
			hr.setDname("Dk");
			
			Employee e1=new Employee();
			e1.setEid(153);
			e1.setName("Pravin");
			
			Employee e2=new Employee();
			e2.setEid(157);
			e2.setName("Rahul");
			
			e1.setDep(hr);
			e2.setDep(hr);
			session.save(e1);
			session.save(e2);
			tx.commit();
			break;
			case 2:
		
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
