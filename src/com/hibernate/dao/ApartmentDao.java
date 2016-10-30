package com.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.hibernate.bean.Apartment;

public class ApartmentDao {
	private Session session;
	
	public ApartmentDao(Session session) {
		this.session=session;
	}
	
	public List<Apartment> list(){
		Query<Apartment> query = session.createQuery("from Apartment",Apartment.class);
		return query.getResultList();
	}
}
