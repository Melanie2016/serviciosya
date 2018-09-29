package com.capgemini.serviciosya.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.capgemini.serviciosya.model.Country;


@Repository ("countryDao")
public class CountryDaoImpl implements ICountryDao {

	
	
	@Inject
	private SessionFactory sessionFactory;
	
	
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Country> consultarPaises() {
		
		final Session session = sessionFactory.getCurrentSession();
		
		
		
		return session.createCriteria(Country.class)
				.add(Restrictions.isNotNull("id"))
				.list();
			
				
				
				
	}
	
	
	
	
	
	
	
	
	
	
	

}
