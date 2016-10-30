package com.hibernate.app;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.bean.Student;
import com.hibernate.bean.StudentLogin;
import com.hibernate.dao.StudentDao;

public class test {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		StudentDao dao = new StudentDao(session);
		

		Student student =dao.listByName(2);
		System.out.println(student);
		System.out.println(student.getAccommdations());
		System.out.println(student.getEnrollments());
		
		
		
//		Student student = dao.listByName(101);
//		System.out.println(student);
//		
//		session.clear();
//		System.out.println("student status:");
//		System.out.println(student.getStatus());
		
		
		
//		teacher t = session.get(teacher.class, 3);
//		System.out.println(t);
//		System.out.println(t.getStudents().size());
	}
}
