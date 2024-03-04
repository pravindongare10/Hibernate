package com.client;

import java.util.Scanner;
import org.hibernate.Session;
import com.model.AdhharCard;
import com.utility.HibernateConnectivity;

public class Test {
	
	public static void main(String[] args) {
		
		Session session=HibernateConnectivity.CreateSession();
		Scanner sc=new Scanner(System.in);
		AdhharCard s=new AdhharCard();
		do
		{	
			System.out.println("+++Choice is Yours:+++");
			System.out.println("1.Inset Values");
			System.out.println("2.Update value");
			System.out.println("3.delete value");
			System.out.println("4.Load value ");
			System.out.println("5.Get value");
			System.out.println("6.Exit:");
			int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			s.setAddarno(1234567l);
			s.setName("Pravin");
			s.setMobno(7798912986l);
			s.setAddr("At/P-Pangari");
			session.save(s); 
			session.beginTransaction().commit();
			break;
			case 2:
				s.setAddarno(1234567l);
				s.setName("Rahul");
				s.setMobno(7798912986l);
				s.setAddr("At/P-Pangari");
				session.update(s);
				session.beginTransaction().commit();
				break;
			case 3:
				s.setAddarno(12345671);
				s.setName("Rahul");
				s.setMobno(7798912986l);
				s.setAddr("At/P-Pangari"); 
				session.delete(s);
				session.beginTransaction().commit();
				break;
			case 4:
				s=session.get(AdhharCard.class,1234567l );
				System.out.println(s.getAddarno());
				System.out.println(s.getName());
				break;
			case 5:
				s=session.load(AdhharCard.class, 1234567l);
				System.out.println(s.getAddarno());
				System.out.println(s.getName());
				break;
			case 6:
				System.exit(0);
				
			default:
				System.out.println("That is not a valid option. Please choose again.");	
		}
		
		}while(true);
		
	}

}
