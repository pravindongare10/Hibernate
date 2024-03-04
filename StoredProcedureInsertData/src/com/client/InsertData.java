package com.client;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.utility.HibernateConnectivity;

public class InsertData {

	public static void main(String[] args) {
		Session session=HibernateConnectivity.CreateSession();
		//create object of StoreProcedure Query
		
		StoredProcedureQuery query=session.createStoredProcedureCall("insertdata");
		
		query.registerStoredProcedureParameter("rno",Integer.class, ParameterMode.IN);
		query.registerStoredProcedureParameter("nm",String.class, ParameterMode.IN);
		
		
		query.setParameter("rno", 2);
		query.setParameter("nm", "nk");
		
		query.execute();   
	}

}
