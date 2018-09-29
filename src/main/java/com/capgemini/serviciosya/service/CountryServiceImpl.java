package com.capgemini.serviciosya.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.serviciosya.dao.ICountryDao;
import com.capgemini.serviciosya.model.Country;

@Service ("countryService")
@Transactional
public class CountryServiceImpl implements ICountryService{

	
	
	@Inject
	private ICountryDao countryDao;

	
	
	
	@Override
	public List<Country> listarPaises() {
		// TODO Auto-generated method stub
		return countryDao.consultarPaises();
	}
	
	
	
}
