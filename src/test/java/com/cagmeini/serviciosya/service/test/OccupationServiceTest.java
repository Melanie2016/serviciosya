
package com.cagmeini.serviciosya.service.test;




import java.util.List;

import com.cagmeini.serviciosya.dao.IOccupationDao;
import com.cagmeini.serviciosya.dao.OccupationDaoMemory;
import org.junit.Assert;
import org.junit.Test;

import com.cagmeini.serviciosya.beans.domain.Occupation;
import com.cagmeini.serviciosya.service.OccupationService;


public class OccupationServiceTest {


    private OccupationService occupationService = new OccupationService ();

    private IOccupationDao occupationDao = new OccupationDaoMemory ();


    @Test
    public void testFindAllOccupations () {


        this.occupationService.setOccupationDao (this.occupationDao);

        List<Occupation> list = this.occupationService.findAllOccupations ();

        Assert.assertFalse (list.isEmpty ());
    }

    @Test
    public void testAddOccupation () {


        this.occupationService.setOccupationDao (this.occupationDao);

        Occupation o = new Occupation ("1", "Catador de Ron", "Beber alcohol...");

        List<Occupation> init = this.occupationDao.findAllOccupations ();

        this.occupationService.addOccupation (o);

        List<Occupation> end = this.occupationDao.findAllOccupations ();

        Assert.assertTrue (init.size()+1 == end.size());
    }
    
    @Test
    public void testSearchById() {
    	this.occupationService.setOccupationDao(this.occupationDao);
    	
    	// agrego una ocupacion para testear con un id que conozco
    	Occupation o1 = new Occupation ("1", "Catador de Ron", "Beber alcohol...");
    	this.occupationService.addOccupation(o1);
    	

    	Occupation o2 = this.occupationDao.searchById("1");
    	
//    	Assert.assertEquals(o1.getDescription(),o2.getDescription());
    	Assert.assertTrue(o1.getDescription().equals(o2.getDescription()));
    }
}