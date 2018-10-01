package com.capgemini.serviciosya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ModelAndView inicio() {
		return new ModelAndView("redirect:/home");  // lo cambie a turno probisoriamente
	}
	
	
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public ModelAndView irAHome() {
		return new ModelAndView("home");
	}
	
	
	@RequestMapping(path = "/homeData", method = RequestMethod.GET)
	public ModelAndView irAHomeData() {
		return new ModelAndView("homeData");  // lo cambie a turno probisoriamente
	}
}
