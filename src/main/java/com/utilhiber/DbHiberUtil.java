package com.utilhiber;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbHiberUtil {
	private static SessionFactory sf=null;
	private DbHiberUtil() {
	}
	public static SessionFactory getConnection() {
		Configuration configure = new Configuration().configure();
		sf = configure.buildSessionFactory();
		
		if(sf==null) {
			return sf; 
		}
		return sf;
	}
	
}
