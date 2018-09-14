package com.cagmeini.serviciosya.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.cagmeini.serviciosya.beans.entity.CountryEntity;
import com.cagmeini.serviciosya.beans.entity.ProvinceEntity;
import com.cagmeini.serviciosya.dao.interfaces.ICountryDao;
import com.cagmeini.serviciosya.dao.interfaces.IProvinceDao;
import com.cagmeini.serviciosya.dao.orm.CountryDaoHibernate;
import com.cagmeini.serviciosya.dao.orm.ProvinceDaoHibernate;



public class ProvinceDaoTest {

	
	
	private IProvinceDao dao = new ProvinceDaoHibernate();
	private ICountryDao daoC = new CountryDaoHibernate();

    @Test
    public void testCreate () {

    	CountryEntity c  = new CountryEntity();
    	c.setName("Argentina");
    	this.daoC.create(c);
    	
        ProvinceEntity p = new ProvinceEntity();
        p.setName ("Cordoba");
        p.setCountry(c);
        this.dao.create(p);

        Assert.assertNotNull ("Failure creating new province.", p.getId ());
    }

    @Test
    public void testUpdate () {
    	
    	CountryEntity c  = new CountryEntity();
    	c.setName("Argentina");
    	this.daoC.create(c);
    	
    	ProvinceEntity p = new ProvinceEntity ();
        p.setId (10);
        p.setName ("ARGENTINA");
        p.setCountry(c);
        this.dao.update (p);

        Assert.assertEquals ("Failure updating country.", "ARGENTINA", p.getName ());
    }

    @Test
    public void testDelete () {

        int id = 10;
        this.dao.delete (id);

        ProvinceEntity p = this.dao.findById (id);

        Assert.assertNull ("Failure deleting country.", p);
    }

    @Test
    public void testFindAll () {

        List<ProvinceEntity> list = this.dao.findAll ();

        list.forEach (System.out::println);

        Assert.assertFalse ("Failure find all countries.", list.isEmpty ());
    }
    
    @Test
    public void testFindById () {

    	// i know that province name is "Cordoba"
    	Integer id = 14;
        ProvinceEntity p = this.dao.findById(id);

        String valorEsperado = "Cordoba";
        
        
//        Assert.assertNotNull(p);
        Assert.assertEquals(p.getName(), valorEsperado);
        
        System.out.println(p.toString());
    }
}
