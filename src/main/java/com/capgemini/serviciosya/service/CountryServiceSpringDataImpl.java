package com.capgemini.serviciosya.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.serviciosya.dao.ICountryDaoSpringData;
import com.capgemini.serviciosya.model.Province;

@Service ("countryServiceSpringData")
@Transactional
public class CountryServiceSpringDataImpl implements ICountryServiceSpringData{

	
	
	@Inject ICountryDaoSpringData countryDao;
	
	
	
	@Override
	public List<Province> consultProvincesByCountryName(String name) {
		
		return countryDao.consultCountries();
	}

	
	
}
