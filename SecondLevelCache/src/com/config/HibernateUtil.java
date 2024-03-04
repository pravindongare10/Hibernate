package com.config;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.model.Student;



public class HibernateUtil {

	private static SessionFactory sf;
	
	private static StandardServiceRegistry registry;
	
	public static SessionFactory getSessionFactory() {
		try {
			if(sf==null) {
				Map<String,String> map=new HashMap<String,String>();
				//Connection mapping Commands
				map.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
				map.put(Environment.URL,"jdbc:mysql://localhost:3306/secondlevelCache");
				map.put(Environment.USER, "root");
				map.put(Environment.PASS, "root");
				//Hibernate mapping commands	
				
				map.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
				map.put(Environment.HBM2DDL_AUTO,"update");	
				map.put(Environment.SHOW_SQL,"true");
				
				map.put(Environment.USE_SECOND_LEVEL_CACHE,"true");
				//EhCacheRegionFactory
				map.put(Environment.CACHE_REGION_FACTORY,"org.hibernate.cache.ehcache.EhCacheRegionFactory");
				
				//Create Object of StandardServiceRegistry
				registry=new StandardServiceRegistryBuilder().applySettings(map).build();
				 
				//Create Object MetaDatasource
				MetadataSources mds=new MetadataSources(registry);
				
				//entity class mapping
				mds.addAnnotatedClass(Student.class);
				
				//Create Object of metaData
				
				Metadata md=mds.getMetadataBuilder().build();
				
				sf=md.getSessionFactoryBuilder().build();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sf;
	}
		
}
 