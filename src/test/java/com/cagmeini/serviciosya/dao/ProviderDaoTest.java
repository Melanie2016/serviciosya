package com.cagmeini.serviciosya.dao;

import org.junit.Assert;
import org.junit.Test;

import com.cagmeini.serviciosya.beans.entity.CityEntity;
import com.cagmeini.serviciosya.beans.entity.ProviderEntity;
import com.cagmeini.serviciosya.dao.orm.ProviderDaoHibernate;
import com.cagmeini.serviciosya.dao.repositories.IProviderDao;

public class ProviderDaoTest {

//
//    private IProviderDao dao = new ProviderDaoHibernate ();
//
//
//	// @Rule buscar como usar una regla para recibir una exception
//
//
//    //(expected=DaoException.class)
//	@Test (expected=DaoException.class)
//	public void testThatAnInvalidEmailHasNotBeenInserted ()  throws DaoException {
//	
//	    ProviderEntity p = new ProviderEntity ();
//	    p.setName("Bart");
//	    p.setLastName("Simpson");
//	    p.setDni(12345);
//	    p.setEmail("jajajaj0@ajjjj.com");
//	    p.setPhone ("1234564490");
//	    p.setAddress("Cordoba");
//	    CityEntity city = new CityEntity();
//	    city.setId(2);
//	    p.setCity(city);
//	    p.setStatus(0);
//	    this.dao.create (p);
//	    
//	    Boolean val = true;
//
//	    if (p.getId() == 0) {
//	    	val = false;
//	    }
//
//	    Assert.assertFalse(val);
//	    
//	//    Assert.assertNotNull ("Failure creating new country.", p.getId ());
//	 }
//	
//	
//	@Test 
//	public void testCreate ()  {
//	
//	    ProviderEntity p = new ProviderEntity ();
//	    p.setName("Lisa");
//	    p.setLastName("Simpson");
//	    p.setDni(11111);
//	    p.setEmail("lisa@gmail.com");
//	    p.setPhone ("1111111");
//	    p.setAddress("Cordoba");
//	    CityEntity city = new CityEntity();
//	    city.setId(2);
//	    p.setCity(city);
//	    p.setStatus(0);
//	    this.dao.create (p);
//
//	    Assert.assertNotNull ("Failure creating new country.", p.getId ());
//	 }
//	
////	    @Test
////	    public void testFindAll () {
////	
////	
////	        ProviderEntity p = this.dao.findById (1);
////	
////	        p.getOccupations().forEach( e -> System.out.println (e.getName ()));
////	
////	
////	        Assert.assertFalse ("Failure find all provider.", p.getOccupations().isEmpty());
////	    }
//	
//	    @Test
//	    public void testFindByDNI () {
//	
//	        ProviderEntity p = this.dao.findByDNI (12345);
//	
//	        Assert.assertNotNull ("Failure find by dni.", p);
//	    }
	
	
	
}
