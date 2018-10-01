package com.capgemini.serviciosya.dao;

import java.util.List;

import com.capgemini.serviciosya.model.City;
import com.capgemini.serviciosya.model.Country;
import com.capgemini.serviciosya.model.Province;



//para adaptar con springData	
//https://anotherdayanotherbug.wordpress.com/2014/12/05/implementar-la-capa-de-base-de-datos-con-spring-data/


public interface ICountryDao {

	List<Country> consultCountriesByName(String name);
	
	List<Province> consultProvincesByCountryName(String name);
	
	List<Country> consultCountries();

	void addCountry(Country country);

	List<City> consultCitiesByProvince(int idProvince);

	
	

	

	

}
