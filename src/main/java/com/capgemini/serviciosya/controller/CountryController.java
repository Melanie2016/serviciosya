package com.capgemini.serviciosya.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.serviciosya.model.City;
import com.capgemini.serviciosya.model.Country;
import com.capgemini.serviciosya.model.Province;
import com.capgemini.serviciosya.service.ICountryService;





@Controller
public class CountryController {

	
	@Inject
	private ICountryService countryService;
	
	
	
	@RequestMapping(path="country/name/{name}")
	public ModelAndView provinces(@PathVariable String name) {
		
		// pasar a mayuscula los nombres 
		ModelMap model = new ModelMap();
		
//		String names = name.toUpperCase();
		
		List<Province> list = countryService.consultProvincesByCountryName(name);
		
		model.put("provinces", list);		
		
		return new ModelAndView ("provincesByCountryName",model);
	}
	
	
	
	
	
	@RequestMapping(path="country/province/{idProvince}")
	public ModelAndView cities(@PathVariable int idProvince) {
		
		// pasar a mayuscula los nombres 
		ModelMap model = new ModelMap();
		
//		String names = name.toUpperCase();
		
		List<City> list = countryService.consultCitiesByProvince(idProvince);
		
		model.put("cities", list);		
		
		return new ModelAndView ("citiesByProvince",model);
	}
	
	
	
	
	@RequestMapping(path="/addCountry", method = RequestMethod.GET)
	public ModelAndView assCountry() {
		
		ModelMap model = new ModelMap();
		Country country = new Country();
		
		model.put("countries", country);		
		
		return new ModelAndView ("countries",model);
	}
	
	@RequestMapping(path="/addCountry", method = RequestMethod.POST)
	public ModelAndView registroCiudades(@ModelAttribute ("countries") Country country ) {
		
		
		ModelMap model = new ModelMap();
		countryService.addCountry(country);
		
		List<Country> list = countryService.listCountries();
		
		model.put("countries",list);
		
		
		
		
		return new ModelAndView ("countryHistory",model);
	}
	
	
	
	
}
