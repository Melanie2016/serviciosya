package com.capgemini.serviciosya.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.cagmeini.serviciosya.api.dao.repositories.IOccupationRepository;

@RestController
@RequestMapping ("occupation")
public class OccupationController {
	
	private IOccupationRepository occupationRepository ;
	
	
	public OccupationController() {
		
	}
	
	
	@RequestMapping (method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> get () {

    	// Return the value.
    	return ResponseEntity.ok (this.occupationRepository.findAll ());
    }
	
	

}
