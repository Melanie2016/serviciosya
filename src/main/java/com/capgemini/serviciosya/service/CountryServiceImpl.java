package com.capgemini.serviciosya.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.serviciosya.dao.ICountryDao;
import com.capgemini.serviciosya.model.City;
import com.capgemini.serviciosya.model.Country;
import com.capgemini.serviciosya.model.Province;

@Service ("countryService")
@Transactional
public class CountryServiceImpl implements ICountryService{

	
	
	@Inject
	private ICountryDao countryDao;

	
	
	@Override
	public List<Country> listCountries() {
		
		return countryDao.consultCountries();
	}
	
	
	@Override
	public List<Country> listCountriesByName(String name) {
		
		return countryDao.consultCountriesByName(name);
	}
	
	
	@Override
	public List<Province> consultProvincesByCountryName(String name) {
		
		return countryDao.consultProvincesByCountryName(name);
	}
	
	
	@Override
	public List<City> consultCitiesByProvince(int idProvince) {
		
		return countryDao.consultCitiesByProvince(idProvince);
	}

	
	
	




	@Override
	public void addCountry(Country country) {
		countryDao.addCountry(country);
		
	}


	
	




	
	
	
	
}
