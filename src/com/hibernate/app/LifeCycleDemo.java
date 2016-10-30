package com.hibernate.app;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.bean.StudentStatus;

public class LifeCycleDemo {
	public static void main(String[] args) {
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session session = sf.openSession();
			
			//触发 onLoad
			StudentStatus stat = session.get(StudentStatus.class, 110);
			System.out.println(stat);
			
			//触发onUpdate
			stat.setCode("dfdf");
			session.update(stat);
			
			//触发onSave
			StudentStatus stat2 = new StudentStatus();
			stat2.setCode("ssss");
			stat2.setName("name");
			stat2.setDescription("des");
			stat2.setId(10);
			
			Transaction tx = session.beginTransaction();
			session.save(stat2);
			tx.commit();
			
			//触发onDelete
			tx = session.beginTransaction();
			session.delete(stat2);
			tx.commit();
			
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}
}
