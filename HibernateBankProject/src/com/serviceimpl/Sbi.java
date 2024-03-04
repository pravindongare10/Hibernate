package com.serviceimpl;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Account;
import com.model.Bank;
import com.service.Rbi;
import com.utility.HibernateConnectivity;


public class Sbi implements Rbi{
	Scanner sc=new Scanner(System.in);
	Session session=HibernateConnectivity.CreateSession();
	@Override
	public void createAccount() {
		Transaction tx=session.beginTransaction();
		Bank bk=new Bank();
		bk.setMicrcode(1000l);
		bk.setIfsccode("kotu123");
		bk.setBname("CentralBank");
		
		Account s=new Account();
		System.out.println("Enter customer accno:");
		long a=sc.nextLong();
		s.setAccno(a);
		System.out.println("Enter customer Name:");
		String a1=sc.next();
		s.setName(a1);
		System.out.println("Enter customer Mobno:");
		long a2=sc.nextLong();
		s.setMobno(a2);
		System.out.println("Enter customer Adharno:");
		long a3=sc.nextLong();
		s.setAdharno(a3);
		System.out.println("Enter customer Gender:");
		String a4=sc.next();
		s.setGender(a4);
		System.out.println("Enter customer age:");
		int a5=sc.nextInt();
		s.setAge(a5);
		System.out.println("Enter customer balance:");
		double a6=sc.nextDouble();
		s.setBalance(s.getBalance()+a6);
		
		Account s1=new Account();
		System.out.println("Enter customer accno:");
		long b=sc.nextLong();
		s1.setAccno(b);
		System.out.println("Enter customer Name:");
		String b1=sc.next();
		s1.setName(a1);
		System.out.println("Enter customer Mobno:");
		long b2=sc.nextLong();
		s1.setMobno(b2);
		System.out.println("Enter customer Adharno:");
		long b3=sc.nextLong();
		s1.setAdharno(b3);
		System.out.println("Enter customer Gender:");
		String b4=sc.next();
		s1.setGender(b4);
		System.out.println("Enter customer age:");
		int b5=sc.nextInt();
		s1.setAge(b5);
		System.out.println("Enter customer balance:");
		double b6=sc.nextDouble();
		s1.setBalance(s.getBalance()+b6);
		
		s.setCentral(bk);
		
		s1.setCentral(bk);
		
		session.save(s);
		
		session.save(s1);
		tx.commit();
	}

	@Override
	public void displayAllDetails() {
		
		
	}

	@Override
	public void updateAccount() {
	
		
	}

	@Override
	public void deleteAccount() {
		
		
	}

	@Override
	public void depositeMony() {
		
		
	}

	@Override
	public void withDrawal() {
	
		
	}

	@Override
	public void balanceCheck() {
		
		
	}


}
