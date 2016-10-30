package com.hibernate.app;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;

import com.hibernate.bean.Student;

public class CriteriaDemo {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		try {
			Criteria criteria = session.createCriteria(Student.class);
			
			List students = criteria.list();
			
			for(Object s:students){
				System.out.println(s);
			}
			
			DetachedCriteria c = DetachedCriteria.forClass(Student.class);
			Criteria cc = c.getExecutableCriteria(session);
			List s = cc.list();
			for(Object o:s){
				System.out.println(o);
			}
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
