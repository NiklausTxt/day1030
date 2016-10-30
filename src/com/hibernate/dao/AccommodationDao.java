package com.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.hibernate.bean.Accommodation;

public class AccommodationDao {
	private Session session;

	public AccommodationDao(Session session) {
		this.session=session;
	}
	
	public List<Accommodation> list(){
		Query<Accommodation> query = session.createQuery("from Accommodation",Accommodation.class);
		return query.getResultList();
	}
}
