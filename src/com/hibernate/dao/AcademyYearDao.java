package com.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.hibernate.bean.AcademyYear;

public class AcademyYearDao {
	private Session session;
	public AcademyYearDao(Session session) {
		this.session=session;
	}
	public List<AcademyYear> list(){
		Query<AcademyYear> query = session.createQuery("from AcademyYear",AcademyYear.class);
		return query.getResultList();
	}
}
