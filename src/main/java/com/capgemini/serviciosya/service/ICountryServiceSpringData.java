package com.capgemini.serviciosya.service;

import java.util.List;

import com.capgemini.serviciosya.model.Province;

public interface ICountryServiceSpringData {

	List<Province> consultProvincesByCountryName(String name);

	
	
	
}
