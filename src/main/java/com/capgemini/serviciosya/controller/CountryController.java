package com.capgemini.serviciosya.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.serviciosya.model.Country;
import com.capgemini.serviciosya.service.ICountryService;





@Controller
public class CountryController {

	
	@Inject
	private ICountryService countryService;
	
	
	
	
	
	@RequestMapping(path="/hola")
	public ModelAndView hola() {
		
		ModelMap model = new ModelMap();
		
		
		List<Country> list = countryService.listarPaises();
		
		model.put("lista", list);
		
		
		
		return new ModelAndView ("hola",model);
	}
	
	
	
	
	
	
}
