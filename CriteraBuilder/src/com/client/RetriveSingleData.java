package com.client;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.config.HibernateUtil;
import com.model.Student;

public class RetriveSingleData {

	public static void main(String[] args) {
		//select * from student where rollno=1;
		
		 SessionFactory sf=HibernateUtil.getSessionFactory();
		 Session session=sf.openSession();
		 //step 1 create object of CriteraBuilder
		 CriteriaBuilder cb=session.getCriteriaBuilder();
		 
		 //step 2 create object of CriteriaQuery
		CriteriaQuery<Student> cq =cb.createQuery(Student.class);
		 
		 //step 3 fetch the Student object
		 Root<Student>studentroot=cq.from(Student.class);
		   
		 //step 4 select the student object
		 
		 cq.where(cb.equal(studentroot.get("sid"), 1));
		 
		 Query<Student> query=session.createQuery(cq);
		Student s=query.getSingleResult();
		
			System.out.println(s.getSid());
			System.out.println(s.getSname());
	}

}
