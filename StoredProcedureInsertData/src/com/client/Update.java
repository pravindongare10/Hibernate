package com.client;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;

import com.utility.HibernateConnectivity;

public class Update {

	public static void main(String[] args) {
		Session session=HibernateConnectivity.CreateSession();
		//create object of StoreProcedure Query
		
		StoredProcedureQuery query=session.createStoredProcedureCall("updatedata");
		
		query.registerStoredProcedureParameter("rno",Integer.class, ParameterMode.IN);
		query.registerStoredProcedureParameter("nm",String.class, ParameterMode.IN);
		
		
		query.setParameter("rno", 2);
		query.setParameter("nm", "Dongare");
		
		query.execute();

	}

}
