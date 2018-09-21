package com.cagmeini.serviciosya.repositories.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cagmeini.serviciosya.beans.entity.CountryEntity;
import com.cagmeini.serviciosya.beans.entity.ProvinceEntity;
import com.cagmeini.serviciosya.dao.repositories.ICountryDao;
import com.cagmeini.serviciosya.dao.repositories.IProvinceDao;



public class ProvinceRepositoryTest {

	@Autowired
    private ICountryDao   repositoryCountry = null;

    @Autowired
    private IProvinceDao repositoryProvince = null;


    private final Logger logger = LoggerFactory.getLogger (ProvinceRepositoryTest.class);


    public ProvinceRepositoryTest () {

        super ();
    }


    @Before
    public void setup () {

        logger.info ("Creating countries...");
        CountryEntity[] countries = new CountryEntity [] {

                new CountryEntity (Integer.valueOf (1),"Argentina"),
                new CountryEntity (Integer.valueOf (2),"Venezuela")
        };
        logger.debug (String.format ("Objects country created %s", Arrays.toString (countries)));

        logger.debug ("Saving countries...");
        this.repositoryCountry.save (Arrays.asList (countries));
        logger.debug (String.format ("Countries saved %s", Arrays.toString (countries)));


        logger.info ("Creating provinces...");
        ProvinceEntity[] provinces = new ProvinceEntity [] {

                new ProvinceEntity (Integer.valueOf (1), "Buenos Aires", countries[0]),
                new ProvinceEntity (Integer.valueOf (2), "Cordoba", countries[0]),
                new ProvinceEntity (Integer.valueOf (3), "Caracas", countries[1]),
                new ProvinceEntity (Integer.valueOf (4), "Miranda", countries[0])
        };
        logger.debug (String.format ("Objects province created %s", Arrays.toString (countries)));

        logger.debug ("Saving provinces...");
        this.repositoryProvince.save (Arrays.asList (provinces));
        logger.debug (String.format ("Provinces saved %s", Arrays.toString (provinces)));
    }

    @Test
    public void testGetAllByCountry () {

        logger.info ("Getting provinces...");

        CountryEntity c = new CountryEntity ();
        c.setId (Integer.valueOf (1));

        List<ProvinceEntity> list = this.repositoryProvince.findAllByCountryOrderByNameDesc (c);

        Assert.assertNotNull ("There are provinces...", list);
        Assert.assertFalse ("There are provinces...",list.isEmpty ());
    }
}
