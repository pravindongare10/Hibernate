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

public class RetriveAllData {

	public static void main(String[] args) {
		//select * from student
		
		 SessionFactory sf=HibernateUtil.getSessionFactory();
		 Session session=sf.openSession();
		 //step 1 create object of CriteraBuilder
		 CriteriaBuilder cb=session.getCriteriaBuilder();
		 
		 //step 2 create of CriteriaQuery
		CriteriaQuery<Student> cq =cb.createQuery(Student.class);
		 
		 //step 3 fetch the Student object
		 Root<Student>studentroot=cq.from(Student.class);
		 
		 //step 4 select the student object
		 
		 cq.select(studentroot);
		 
		Query<Student> query= session.createQuery(cq);
		 
		 List<Student> list=query.getResultList();
		 
		 list.forEach(s->{
			 System.out.println(s.getSid());
			 System.out.println(s.getSname());
		 });
		 
	}

}
