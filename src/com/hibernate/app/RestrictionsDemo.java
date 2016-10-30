package com.hibernate.app;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.bean.Student;

public class RestrictionsDemo {
	public static void main(String[] args) {
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session session = sf.openSession();
			
			Criteria criteria = session.createCriteria(Student.class);
			
			criteria.add(Restrictions.eq("gender", "ÄÐ"));
			criteria.add(Restrictions.eq("lastname", "ÕÅ"));
			
			List<Student> students = criteria.list();
			for(Student o:students){
				System.out.println(o);
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
