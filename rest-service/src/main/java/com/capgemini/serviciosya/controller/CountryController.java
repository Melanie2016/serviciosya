
package com.capgemini.serviciosya.controller;


import com.capgemeini.serviciosya.beans.entity.CountryEntity;
import com.capgemeini.serviciosya.beans.entity.ProvinceEntity;
import com.capgemeini.serviciosya.dao.ICountryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping ("countries")
public class CountryController {


    @Autowired
    private ICountryDao countryDao;




    public CountryController () {

        super ();
    }


    @RequestMapping (method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getAll () {

        // Return the value.
        return ResponseEntity.ok (this.countryDao.findAll ());
    }



    @RequestMapping (value = "/{id}", method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getById (@PathVariable("id") Integer id) {


        CountryEntity c = this.countryDao.findOne (id);

        if (c == null) {

            return ResponseEntity.notFound().build();

        } else {

            return ResponseEntity.ok (this.countryDao.findOne (id));
        }
    }







    @RequestMapping (method = RequestMethod.POST, produces={MediaType.APPLICATION_JSON_VALUE},consumes ={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> add(@RequestBody CountryEntity country)  {

        CountryEntity c = new CountryEntity(country.getId(),country.getName());
        this.countryDao.save(c);

        return ResponseEntity.ok(c);
    }


    @RequestMapping (method = RequestMethod.DELETE, produces={MediaType.APPLICATION_JSON_VALUE},consumes ={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> update(@RequestBody CountryEntity country)  {

        if(!(this.countryDao.getOne(country.getId()) == null || this.countryDao.getOne(country.getId()).getId() == 0 )){

            CountryEntity c = this.countryDao.getOne(country.getId());

            c.setId(country.getId());
            c.setName(country.getName());

            return ResponseEntity.ok(country);
        }

        return ResponseEntity.notFound().build();
    }



    @RequestMapping (value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> delete (@PathVariable("id") Integer id) {


       // CountryEntity c = this.countryDao.findOne (id);

        if (this.countryDao.findOne(id) != null ) {
            this.countryDao.delete(this.countryDao.findOne(id));


            return ResponseEntity.ok().build();

        } else {

            //https://www.baeldung.com/spring-response-entity
            return new ResponseEntity<>("-No se puede eliminar el pais, pruebe con un id existente", HttpStatus.OK);
        }



    }








}