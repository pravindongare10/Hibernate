package com.client;

import org.hibernate.Session;

import com.model.AdharCard;
import com.model.Person;
import com.utility.HibernateConnectivity;

public class Test {

	public static void main(String[] args) {
		Session session=HibernateConnectivity.CreateSession();
		
		AdharCard ad1=new AdharCard();
		ad1.setAdharno(54321);
		ad1.setAdharname("Rahul");
		
		Person p=new Person();
		p.setPid(2);
		p.setPname("Rahul");
		p.setAd(ad1);
		ad1.setPs(p);
		session.save(p);
		session.beginTransaction().commit();
		
	}

}
