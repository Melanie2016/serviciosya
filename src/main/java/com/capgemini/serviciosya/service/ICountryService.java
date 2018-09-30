package com.capgemini.serviciosya.service;

import java.util.List;

import com.capgemini.serviciosya.model.City;
import com.capgemini.serviciosya.model.Country;
import com.capgemini.serviciosya.model.Province;

public interface ICountryService {

	
	List<Country> listCountriesByName(String name);
	
	List<Country> listCountries();

	void addCountry(Country country);

	List<Province> consultProvincesByCountryName(String name);

	List<City> consultCitiesByProvince(int idProvince);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
