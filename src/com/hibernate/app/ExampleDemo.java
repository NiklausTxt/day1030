package com.hibernate.app;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

import com.hibernate.bean.Student;

public class ExampleDemo {
	public static void main(String[] args) {
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session session = sf.openSession();
			
			Student stu = new Student();
			stu.setGender("ÄÐ");
			stu.setLastname("Áõ");
			
			Example studentExample = Example.create(stu);
			studentExample.excludeZeroes();
			
			Criteria criteria = session.createCriteria(Student.class);
			criteria.add(studentExample);
			
			List<Student> students = criteria.list();
			for(Student o:students){
				System.out.println(o);
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
