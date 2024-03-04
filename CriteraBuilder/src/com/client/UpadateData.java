package com.client;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.config.HibernateUtil;
import com.model.Student;

public class UpadateData {

	public static void main(String[] args) {
		//update student set sname='dk' where sid=1;
		
		 SessionFactory sf=HibernateUtil.getSessionFactory();
		 Session session=sf.openSession();
		 //step 1 create object of CriteraBuilder
		 CriteriaBuilder cb=session.getCriteriaBuilder();
		 
		 //step 2 create object of CriteriaUpdate
		CriteriaUpdate<Student> cu=cb.createCriteriaUpdate(Student.class);
		 
		 //step 3 fetch the Student object
		 Root<Student>studentroot=cu.from(Student.class);
		 
		 cu.set(studentroot.get("sname"),"abc");
		 cu.where(cb.equal(studentroot.get("sid"),2));
		 
		 Query<Student> query=session.createQuery(cu);
		 
		 Transaction tx=session.beginTransaction();
		 query.executeUpdate();
		 tx.commit();
	}

}
