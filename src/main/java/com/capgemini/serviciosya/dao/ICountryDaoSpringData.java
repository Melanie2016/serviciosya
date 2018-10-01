package com.capgemini.serviciosya.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.serviciosya.model.Country;
import com.capgemini.serviciosya.model.Province;



public interface ICountryDaoSpringData extends JpaRepository<Country, Integer>{

	
//	https://anotherdayanotherbug.wordpress.com/2014/12/05/implementar-la-capa-de-base-de-datos-con-spring-data/
	
	List<Province> consultCountries();

}
