package com.capgemini.serviciosya.dao;

import java.util.List;

import com.capgemini.serviciosya.model.City;
import com.capgemini.serviciosya.model.Country;
import com.capgemini.serviciosya.model.Province;

public interface ICountryDao {

	List<Country> consultCountriesByName(String name);
	
	List<Province> consultProvincesByCountryName(String name);
	
	List<Country> consultCountries();

	void addCountry(Country country);

	List<City> consultCitiesByProvince(int idProvince);

	
	

	

	

}
