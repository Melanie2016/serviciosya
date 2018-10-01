package com.capgemini.serviciosya.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.serviciosya.model.Province;
import com.capgemini.serviciosya.service.ICountryServiceSpringData;



@Controller
public class CountrySpringDataController {

	
	@Inject ICountryServiceSpringData countryService;
	
	
	@RequestMapping(path="countryData/name/{name}")
	public ModelAndView provincesData(@PathVariable String name) {
		
		ModelMap model = new ModelMap();
		
//		String names = name.toUpperCase();
		
		List<Province> list = countryService.consultProvincesByCountryName(name);
		
		model.put("provinces", list);		
		
		return new ModelAndView ("provincesByCountryNameWithSpringData",model);
	}
}
