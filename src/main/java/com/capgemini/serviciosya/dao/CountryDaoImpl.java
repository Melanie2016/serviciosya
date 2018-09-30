package com.capgemini.serviciosya.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.capgemini.serviciosya.model.Country;
import com.capgemini.serviciosya.model.Province;


@Repository ("countryDao")
public class CountryDaoImpl implements ICountryDao {

	
	
	@Inject
	private SessionFactory sessionFactory;
	
	
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Country> consultCountriesByName(String name) {
		
		final Session session = sessionFactory.getCurrentSession();
		
		return session.createCriteria(Country.class)
				.add(Restrictions.eq("name", name))
				.list();
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Province> consultProvincesByCountryName(String name) {
		
		final Session session = sessionFactory.getCurrentSession();
		
		return session.createCriteria(Province.class,"classGral")
				.createAlias("classGral.country", "country")
				.add(Restrictions.eq("country.name", name))
				.list();
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Country> consultCountries() {
		
		final Session session = sessionFactory.getCurrentSession();
		
		return session.createCriteria(Country.class)
				.add(Restrictions.isNotNull("id"))
				.list();
							
	}





	@Override
	public void addCountry(Country country) {
		
		final Session session = sessionFactory.getCurrentSession();
		
		session.save(country);
		
	}





	
	
	
	
	
	
	
	
	
	
	
	

}
