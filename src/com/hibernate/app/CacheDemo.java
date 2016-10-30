package com.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.bean.StudentStatus;

public class CacheDemo {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		StudentStatus stat = session.get(StudentStatus.class, 110);
		System.out.println(stat);
		
		session.clear();
		
		stat = session.get(StudentStatus.class, 110);
		System.out.println(stat);
		
	}
}
