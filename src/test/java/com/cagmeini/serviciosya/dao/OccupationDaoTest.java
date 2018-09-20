package com.cagmeini.serviciosya.dao;

import org.junit.Assert;
import org.junit.Test;

import com.cagmeini.serviciosya.beans.entity.OccupationEntity;
import com.cagmeini.serviciosya.dao.orm.OccupationDaoHibernate;
import com.cagmeini.serviciosya.dao.repositories.IOccupationDao;

public class OccupationDaoTest {

	
	private IOccupationDao dao = new OccupationDaoHibernate();

    @Test
    public void testCreate () {
    	
    	OccupationEntity parent = new OccupationEntity();

    	parent.setDescription("parent...");
		parent.setName("Ocupacion parent");
    	parent.setParent(null);
		this.dao.create(parent);
    	OccupationEntity o1 = new OccupationEntity();

    	o1.setDescription("lala..");
		o1.setName("Ocupacion 1");
    	o1.setParent(parent);
    	
    	this.dao.create(o1);
    	
        
        Assert.assertNotNull ("Failure creating new province.", o1.getId ());
        
    }

//    @Test
//    public void testUpdate () {
//    	
//    	CountryEntity c  = new CountryEntity();
//    	c.setName("Argentina");
//    	this.daoC.create(c);
//    	
//    	ProvinceEntity p = new ProvinceEntity ();
//        p.setId (11);
//        p.setName ("BUENOS AIRES");
//        p.setCountry(c);
//        this.dao.update (p);
//
//        Assert.assertEquals ("Failure updating country.", "BUENOS AIRES", p.getName ());
//    }
//
//    @Test
//    public void testDelete () {
//
//        int id = 10;
//        this.dao.delete (id);
//
//        ProvinceEntity p = this.dao.findById (id);
//
//        Assert.assertNull ("Failure deleting country.", p);
//    }
//
//    @Test
//    public void testFindAll () {
//
//        List<ProvinceEntity> list = this.dao.findAll ();
//
//        list.forEach (System.out::println);
//
//        Assert.assertFalse ("Failure find all countries.", list.isEmpty ());
//    }
//    
//    @Test
//    public void testFindById () {
//
//    	// i know that province name is "Cordoba"
//    	Integer id = 14;
//        ProvinceEntity p = this.dao.findById(id);
//
//        String valorEsperado = "Cordoba";
//        
//        
////        Assert.assertNotNull(p);
//        Assert.assertEquals(p.getName(), valorEsperado);
//        
//        System.out.println(p.toString());
//    }
}
