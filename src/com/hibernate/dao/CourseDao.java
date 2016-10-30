package com.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.hibernate.bean.Course;

public class CourseDao {
	private Session session;
	
	public CourseDao(Session session) {
		this.session = session;
	}
	
	public Course getCourseById(int id){
		Query<Course> query = session.createQuery("from course where id=?");
		return query.getSingleResult();
	}
}
