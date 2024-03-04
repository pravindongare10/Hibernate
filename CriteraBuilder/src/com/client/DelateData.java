package com.client;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.config.HibernateUtil;
import com.model.Student;

public class DelateData {

	public static void main(String[] args) {
	
		 SessionFactory sf=HibernateUtil.getSessionFactory();
		 Session session=sf.openSession();
		 //step 1 create object of CriteraBuilder
		 CriteriaBuilder cb=session.getCriteriaBuilder();
		 
		 //step 2 create object of CriteriaDelete 
		CriteriaDelete<Student> cu=cb.createCriteriaDelete(Student.class);
		 
		 //step 3 fetch the Student object
		 Root<Student>studentroot=cu.from(Student.class);
		 
	 cu.where(cb.equal(studentroot.get("sid"), 1));
		 
		 Query<Student> query=session.createQuery(cu);
		 
		 Transaction tx=session.beginTransaction();
		 query.executeUpdate();
		 tx.commit();

	}

}
