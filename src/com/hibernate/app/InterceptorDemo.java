package com.hibernate.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.bean.StudentStatus;
import com.hibernate.interceptor.interceptor;

public class InterceptorDemo {
	public static void main(String[] args) {
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			
			Session session = sf.withOptions().interceptor(new interceptor() ).openSession();
			
			StudentStatus stat = session.get(StudentStatus.class, 113);
			System.out.println(stat);
			
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
