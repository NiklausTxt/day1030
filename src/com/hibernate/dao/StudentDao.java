package com.hibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.bean.Student;

public class StudentDao {
	
	private Session session;
	
	public StudentDao(Session session) {
		this.session=session;
	}
	
	public List<Student> list(){
		Query<Student> query = session.createQuery("from Student",Student.class);
		return query.getResultList();
	}

//	public Student listByName(int id){
//		Query<Student> query = session.createQuery("from Student where sid = :name", Student.class);
//		query.setParameter("name", id);
//		Student student = null;
//		List<Student> list =  query.getResultList();
//		for(Student s:list){
//			student = s;
//		}
//		return student;
//		
//	}
	public Student listByName(int id){
		Query<Student> query = session.createQuery("from Student where sid = :name", Student.class);
		query.setParameter("name", id);
		return query.getSingleResult();
		
	}
	
	public void insert(Student student){
		Transaction tx = session.beginTransaction();
		try {
			session.save(student);
			tx.commit();			
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
	
	public void update(Student student){
		Transaction tx = session.beginTransaction();
		try {
			session.update(student);
			tx.commit();			
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
	
	public void delete(Student student){
		Transaction tx = session.beginTransaction();
		try {
			session.delete(student);
			tx.commit();			
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
	
}
