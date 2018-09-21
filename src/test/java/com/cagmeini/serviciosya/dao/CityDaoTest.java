package com.cagmeini.serviciosya.dao;

//import java.util.List;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import com.cagmeini.serviciosya.beans.entity.CityEntity;
//import com.cagmeini.serviciosya.beans.entity.CountryEntity;
//import com.cagmeini.serviciosya.beans.entity.ProvinceEntity;
//import com.cagmeini.serviciosya.dao.orm.CityDaoHibernate;
//import com.cagmeini.serviciosya.dao.orm.CountryDaoHibernate;
//import com.cagmeini.serviciosya.dao.orm.ProvinceDaoHibernate;
//import com.cagmeini.serviciosya.dao.repositories.ICityRepository;
//import com.cagmeini.serviciosya.dao.repositories.ICountryDao;
//import com.cagmeini.serviciosya.dao.repositories.IProvinceDao;

public class CityDaoTest {

	
//	private IProvinceDao dao = new ProvinceDaoHibernate();
//	private ICountryDao daoC = new CountryDaoHibernate();
//	private ICityRepository daoCity = new CityDaoHibernate();
//
//    @Test
//    public void testCreate () {
//
//    	CountryEntity c  = new CountryEntity();
//    	c.setName("Argentina");
//    	this.daoC.create(c);
//    	
//        ProvinceEntity p = new ProvinceEntity();
//        p.setName ("Buenos Aires");
//        p.setCountry(c);
//        this.dao.create(p);
//        
//        CityEntity cc = new CityEntity();
//        cc.setName("Castelar");
//        cc.setProvince(p);
//        this.daoCity.create(cc);
//
//        Assert.assertNotNull ("Failure creating new province.", p.getId ());
//    }
//
//    @Test
//    public void testUpdate () {
//    	
//    	CountryEntity c  = new CountryEntity();
//    	c.setName("Argentina");
//    	this.daoC.create(c);
//    	
//    	ProvinceEntity p = new ProvinceEntity ();
//        p.setName ("Buenos aires");
//        p.setCountry(c);
//        this.dao.create (p);
//        
//        CityEntity cc = new CityEntity();
//        cc.setId(4);
//        cc.setName("CASTELAR");
//        cc.setProvince(p);
//        this.daoCity.update(cc);
//
//        Assert.assertEquals ("Failure updating country.", "CASTELAR", cc.getName ());
//    }
//
//    @Test
//    public void testDelete () {
//
//        int id = 4;
//        this.daoCity.delete (id);
//
//        CityEntity c  = this.daoCity.findById(id);
//
//        Assert.assertNull ("Failure deleting country.", c);
//    }
//
//    @Test
//    public void testFindAll () {
//
//        List<CityEntity> list = this.daoCity.findAll ();
//
//        list.forEach (System.out::println);
//
//        Assert.assertFalse ("Failure find all countries.", list.isEmpty ());
//    }
//    
//    @Test
//    public void testFindById () {
//
//    	// i know that province name is "Castelar"
//    	Integer id = 3;
//        CityEntity p = this.daoCity.findById(id);
//
//        String valorEsperado = "Castelar";
//        
//        
////        Assert.assertNotNull(p);
//        Assert.assertEquals(p.getName(), valorEsperado);
//        
//        System.out.println(p.toString());
//    }
//    
}
