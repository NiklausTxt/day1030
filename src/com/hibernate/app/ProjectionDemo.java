package com.hibernate.app;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.hibernate.bean.Student;

public class ProjectionDemo {
	public static void main(String[] args) {
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session session = sf.openSession();
			
			Criteria criteria = session.createCriteria(Student.class);
			
			ProjectionList proList = Projections.projectionList();
			proList.add(Projections.count("id"));
			proList.add(Projections.max("phone"));
			proList.add(Projections.groupProperty("gender"));
			
			criteria.setProjection(proList);
			
			List<Object> students = criteria.list();
			for(Object o:students){
				System.out.println(Arrays.toString((Object[]) o));
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
