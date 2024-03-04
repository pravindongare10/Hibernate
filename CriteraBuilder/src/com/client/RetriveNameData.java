package com.client;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.config.HibernateUtil;
import com.model.Student;

public class RetriveNameData {

	public static void main(String[] args) {
		//select sname from Student
		
		 SessionFactory sf=HibernateUtil.getSessionFactory();
		 Session session=sf.openSession();
		 //step 1 create object of CriteraBuilder
		 CriteriaBuilder cb=session.getCriteriaBuilder();
		 
		 //step 2 create object of CriteriaQuery
		CriteriaQuery<String> cq =cb.createQuery(String.class);
		 
		 //step 3 fetch the Student object
		 Root<Student>studentroot=cq.from(Student.class);
		 
		 cq.select(studentroot.get("sname"));
		 
		 Query<String> query=session.createQuery(cq);
		 
		 List<String> names=query.getResultList();
		 
		 names.forEach(s->{
			 System.out.println(s);
		 });
	}

}
