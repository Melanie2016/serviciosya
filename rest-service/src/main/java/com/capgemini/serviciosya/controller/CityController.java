package com.capgemini.serviciosya.controller;


import com.capgemeini.serviciosya.beans.entity.CityEntity;
import com.capgemeini.serviciosya.dao.ICityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cities")
public class CityController {

    @Autowired
    private ICityDao cityDao ;


    public CityController(){

    }


    @RequestMapping (method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> get () {

        // Return the value.
        return ResponseEntity.ok (this.cityDao.findAll());
    }


    /*
    @RequestMapping (method = RequestMethod.POST, consumes={MediaType.APPLICATION_JSON_VALUE},produces={MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<?> add (@RequestBody CityEntity city) {

        try {

            CityEntity c = new CityEntity();
            c.setName (city.getName ());
            c.setProvince (city.getProvince ());

            this.cityDao.save (c);

        } catch (Exception e) {

            return ResponseEntity.badRequest ().build ();
        }

        return ResponseEntity.noContent ().build ();
    }*/





}
