package main.java.com.capgemini.serviciosya.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cagmeini.serviciosya.api.dao.repositories.ICityRepository;
import com.cagmeini.serviciosya.api.dao.repositories.IProviderRepository;



@RestController
@RequestMapping("provinces")
public class ProvinceController {

    @Autowired
    private IProviderRepository provinceDao ;


    public ProvinceController(){

    }


    @RequestMapping (method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> get () {

        // Return the value.
        return ResponseEntity.ok (this.provinceDao.findAll());
    }



}
