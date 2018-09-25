package com.capgemini.serviciosya.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.cagmeini.serviciosya.api.dao.repositories.IOccupationRepository;

@RestController
@RequestMapping ("occupation")
public class OccupationController {
	
	private IOccupationRepository occupationRepository ;
	
	
	public OccupationController() {
		
	}
	
	@Autowired
	public void setProductRepository (IOccupationRepository occupationRepository) {
		
		this.occupationRepository = occupationRepository;
	}
	
	@RequestMapping (value = "/",method  = RequestMethod.GET)
	public ResponseEntity<?> get (){
		
		return ResponseEntity.ok (this.occupationRepository.findAll ());
	}
	
	

}
