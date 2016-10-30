package com.hibernate.interceptor;

import java.io.Serializable;
import java.util.Arrays;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

public class interceptor extends EmptyInterceptor{

	@Override
	public boolean onLoad(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		System.out.println("entity: "+entity);
		System.out.println("id: "+id);
		System.out.println("state: "+Arrays.toString(state));
		System.out.println("propertyNames: "+Arrays.toString(propertyNames));
		System.out.println("types: "+Arrays.toString(types));
		
		return true;
	}

	
}
