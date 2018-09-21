package com.cagmeini.serviciosya.repositories.test;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cagmeini.serviciosya.beans.entity.CityEntity;
import com.cagmeini.serviciosya.beans.entity.CountryEntity;
import com.cagmeini.serviciosya.beans.entity.ProvinceEntity;
import com.cagmeini.serviciosya.dao.repositories.ICityDao;
import com.cagmeini.serviciosya.dao.repositories.ICountryDao;
import com.cagmeini.serviciosya.dao.repositories.IProvinceDao;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE , classes = JpaConfiguration.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CityRepositoryTest {


    @Autowired
    private IProvinceDao repositoryProvince = null;

    @Autowired
    private ICountryDao repositoryCountry = null;

    @Autowired
    private ICityDao repositoryCity = null;



    private final Logger logger = LoggerFactory.getLogger (CityRepositoryTest.class);


    @Before
    public void setup () {

        // ------------------ GUARDANDO PAISES ----------------------
        logger.info ("Creating countries...");
        CountryEntity[] countries = new CountryEntity [] {

                new CountryEntity (Integer.valueOf (1), "Argentina"),
                new CountryEntity (Integer.valueOf (2), "Venezuela"),
                new CountryEntity (Integer.valueOf (3), "Uruguay"),
                new CountryEntity (Integer.valueOf (4), "Chile"),
                new CountryEntity (Integer.valueOf (5), "Peru")
        };
        logger.debug (String.format ("Objects country created %s", Arrays.toString (countries)));

        logger.debug ("Saving countries...");
        this.repositoryCountry.save (Arrays.asList (countries));


        // ------------------- GUARDANDO PROVINCIAS -------------------
        logger.info ("Creating provinces...");
        ProvinceEntity[] provinces = new ProvinceEntity [] {

                new ProvinceEntity(Integer.valueOf (6),"Buenos Aires", this.repositoryCountry.getOne(1)),
                new ProvinceEntity(Integer.valueOf (7),"Misiones",this.repositoryCountry.getOne(1)),
                new ProvinceEntity(Integer.valueOf (8),"Cordoba",this.repositoryCountry.getOne(1)),
        };
        logger.debug (String.format ("Objects provinces created %s", Arrays.toString (countries)));

        logger.debug ("Saving provinces...");
        this.repositoryProvince.save (Arrays.asList (provinces));



        // ------------------ GUARDANDO CIUDADES ----------------------


        logger.info ("Creating citys...");
        CityEntity[] cityList = new CityEntity [] {

                new CityEntity (Integer.valueOf (9),this.repositoryProvince.getOne(6),"Caballito"),
                new CityEntity (Integer.valueOf (10),this.repositoryProvince.getOne(6),"San Justo"),
                new CityEntity (Integer.valueOf (11),this.repositoryProvince.getOne(6),"Moron"),
                new CityEntity (Integer.valueOf (12),this.repositoryProvince.getOne(6),"Castelar"),
                new CityEntity (Integer.valueOf (13),this.repositoryProvince.getOne(6),"Ituzaingo"),
        };
        logger.debug (String.format ("Objects city created %s", Arrays.toString (cityList)));

        logger.debug ("Saving city...");
        this.repositoryCity.save (Arrays.asList (cityList));
        logger.debug (String.format ("City saved %s", Arrays.toString (cityList)));
    }


    @Test
    public void testFindOneCityByName(){

        CityEntity city1 =  new CityEntity (Integer.valueOf (3),null,"Moron");

        CityEntity city2 = this.repositoryCity.findOneCityEntityByName("Moron");

        Assert.assertEquals(city1.getName(),city2.getName());

    }

//    @Test
//    public void testfindAllCitiesByProvinceEntities(){
//
//    	ProvinceEntity province = this.repositoryProvince.getOne(6);
//        List<CityEntity> list =  this.repositoryCity.findAllCitiesByProvinceEntities(province.getId());
//
//
//        Assert.assertFalse(list.isEmpty());
//
//
//    }
    
    
    
}