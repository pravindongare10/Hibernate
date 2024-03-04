package com.serviceimpl;
import com.model.Batch;
import com.model.Course;
import com.model.Faculty;
import com.model.Student;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.service.Cjc;
import com.utility.HibernateConnectivity;

public class Karvenager implements Cjc{
	Session session=HibernateConnectivity.CreateSession();
	Scanner sc=new Scanner(System.in);
	@Override
	public void AddCourse() {
		Transaction tx=session.beginTransaction();
		Course co=new Course();
		System.out.println("Enter CId:");
		int cid=sc.nextInt();
		System.out.println("Enter CName");
		String cname=sc.next();
		co.setCid(cid);
		co.setCname(cname);
		session.save(co);
		tx.commit();
	}

	@Override
	public void ViewCourse() {
		System.out.println("Enter CId:");
		int cid=sc.nextInt();
		Course c1=session.get(Course.class,cid);
		System.out.println(c1.getCid());
		System.out.println(c1.getCname());
	}

	@Override
	public void UpdateCourse() {
		System.out.println("Enter CId:");
		int cid=sc.nextInt();
		  Transaction tx1=session.beginTransaction();
		  	Course c1=session.load(Course.class,cid);
			System.out.println("Enter CName");
			String cname=sc.next();
		  	c1.setCname(cname);
		  	session.update(c1);
		  	tx1.commit();
		
	}

	@Override
	public void DeleteCourse() {
		
		System.out.println("Enter CId:");
		int cid=sc.nextInt();
		  Transaction tx2=session.beginTransaction();
		  	Course c1=session.load(Course.class,cid); 
		  	c1.setCid(cid);
		  	session.delete(c1);
		  	tx2.commit();
	}

	@Override
	public void AddFaculty() {
		
		Transaction tx1=session.beginTransaction();
		Faculty f=new Faculty();
		System.out.println("Enter FId:");
		int fid=sc.nextInt();
		System.out.println("Enter FName");
		String cname=sc.next();
		f.setFid(fid);
		f.setFname(cname);
		System.out.println("Enter CId:");
		int cid=sc.nextInt();
		Course c1=session.get(Course.class,cid);
		f.setC(c1);
		session.save(f);
		tx1.commit();
	}

	@Override
	public void ViewFaculty() {
		System.out.println("Enter FId:");
		int fid=sc.nextInt();
		Faculty f1=session.get(Faculty.class,fid);
		System.out.println(f1.getFid());
		System.out.println(f1.getFname());
		System.out.println(f1.getC().getCid());
		System.out.println(f1.getC().getCname());
	}

	@Override
	public void UpdateFaculty() {
		System.out.println("Enter FId:");
		int fid=sc.nextInt();
		  Transaction tx1=session.beginTransaction();
		  	Faculty f1=session.load(Faculty.class,fid);
			System.out.println("Enter CName");
			String fname=sc.next();
		  	f1.setFname(fname);
		  	session.update(f1);
		  	tx1.commit();
	}

	@Override
	public void DeleteFaculty() {
		System.out.println("Enter FId:");
		int fid=sc.nextInt();
		  Transaction tx1=session.beginTransaction();
		  	Faculty f1=session.load(Faculty.class,fid);
		  	session.delete(f1);
		  	tx1.commit();
	}

	@Override
	public void AddBatch() {
		
		Transaction tx1=session.beginTransaction();
		Batch b=new Batch();
		System.out.println("Enter BId:");
		int bid=sc.nextInt();
		System.out.println("Enter BName");
		String bname=sc.next();
		b.setBid(bid);
		b.setBname(bname);
		System.out.println("Enter FId:");
		int Fid=sc.nextInt();
		Faculty f1=session.get(Faculty.class,Fid);
		b.setF(f1);
		session.save(b);
		tx1.commit();
		
	}

	@Override
	public void ViewBatch() {
		System.out.println("Enter BId:");
		int Bid=sc.nextInt();
		Batch b1=session.get(Batch.class,Bid);
		System.out.println(b1.getBid()); 
		System.out.println("Enter BId:");
		int bid=sc.nextInt();
		  Transaction tx1=session.beginTransaction();
		  	Batch b2=session.load(Batch.class,bid);
			System.out.println("Enter BName");
			String bname=sc.next();
		  	b1.setBname(bname);
		  	session.update(b2);
		  	tx1.commit();
	}
	@Override
	public void UpdateBatch() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void DeleteBatch() {
		System.out.println("Enter BId:");
		int bid=sc.nextInt();
		  Transaction tx1=session.beginTransaction();
		  	Batch b1=session.load(Batch.class,bid);
			System.out.println("Enter Bid");
		  	b1.setBid(bid);
		  	session.delete(b1);
		  	tx1.commit();
	}

	@Override
	public void AddStudent() {
		Transaction tx1=session.beginTransaction();
		
		System.out.println("Enter BId:");
		int bid=sc.nextInt();
		Batch b1=session.load(Batch.class,bid);
		
		Student s=new Student();
		System.out.println("Enter SId:");
		int sid1=sc.nextInt();
		System.out.println("Enter SName");
		String sname1=sc.next();
		s.setSid(sid1);
		s.setSname(sname1);
		s.setB(b1);
		
		Student s1=new Student();
		System.out.println("Enter SId:");
		int sid2=sc.nextInt();
		System.out.println("Enter SName");
		String sname2=sc.next();
		s1.setSid(sid2);
		s1.setSname(sname2);
		s1.setB(b1);
		session.save(s);
		session.save(s1);
		tx1.commit();	
	}

	@Override
	public void ViewStudent() {
		System.out.println("Enter SId:");
		int sid=sc.nextInt();
		Student s1=session.get(Student.class,sid);
		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
		System.out.println(s1.getB().getBid());
		System.out.println(s1.getB().getBname());
		System.out.println(s1.getB().getF().getFid());
		System.out.println(s1.getB().getF().getFname());
		System.out.println(s1.getB().getF().getC().getCid());
		System.out.println(s1.getB().getF().getC().getCname());
		
	}

	@Override
	public void UpdateStudent() {
		System.out.println("Enter SId:");
		int sid=sc.nextInt();
		  Transaction tx1=session.beginTransaction();
		  	Student s1=session.load(Student.class,sid);
			System.out.println("Enter SName");
			String sname=sc.next();
		  	s1.setSname(sname);
		  	session.update(s1);
		  	tx1.commit();
		
	}

	@Override
	public void DeleteStudent() {
		System.out.println("Enter SId:");
		int sid=sc.nextInt();
		  Transaction tx1=session.beginTransaction();
		  	Student s1=session.load(Student.class,sid);
			System.out.println("Enter Sid");
		  	s1.setSid(sid);
		  	session.delete(s1);
		  	tx1.commit();
		
	}

	

	
}
