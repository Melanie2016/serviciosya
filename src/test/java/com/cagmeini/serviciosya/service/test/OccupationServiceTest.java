
package com.cagmeini.serviciosya.service.test;

import java.util.ArrayList;
import java.util.List;

import com.cagmeini.serviciosya.dao.IOccupationDao;
import com.cagmeini.serviciosya.dao.OccupationDaoJDBC;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import com.cagmeini.serviciosya.beans.domain.Occupation;



public class OccupationServiceTest {


    private static final Logger logger = Logger.getLogger (OccupationServiceTest.class);


    @Test
    public void testCreate () {

        try {

            // Insert new value.
            logger.info ("Starting occupation add test.");
            IOccupationDao dao = new OccupationDaoJDBC();

            logger.debug ("Inserting new occupation.");
            Occupation c = new Occupation ();
            c.setName ("Rum Tester.");
            c.setDescription ("xxxx");
            dao.create (c);

            logger.debug ("Checking test result.");
            List<Occupation> list = dao.findAll ();

            boolean r = Boolean.FALSE;

            for (Occupation item: list) {

                if (item.getName ().equals (c.getName ())) {
                    r = Boolean.TRUE;
                    break;
                }
            }

            logger.info ("Finishing the test...");
            Assert.assertTrue ("Failure inserting new Occupation.", r);


        } catch (Exception e) {

            Assert.assertNull (e);
        }
    }
    
    
    @Test 
    public void testFindAll() {
    	
    	logger.info ("Starting occupation add test.");
    	IOccupationDao dao = new OccupationDaoJDBC();
    	
    	logger.debug ("Inserting new occupation.");
    	Occupation o1 = new Occupation();
    	Occupation o2 = new Occupation();
    	Occupation o3 = new Occupation();
    	
    	o1.setName("lala1");
    	o1.setDescription("...");
    	o2.setName("lala2");
    	o2.setDescription("...");
    	o3.setName("lala3");
    	o3.setDescription("...");
    	
    	dao.create(o1);
    	dao.create(o2);
    	dao.create(o3);
    	
    	
    	Assert.assertEquals(3, dao.findAll().size());
    }
    
    
    @Test
    public void tesToFindAllIfIDoNotKnowTheNumberOfOccupationsThatWereEntered() {
    	
    	// Insert new value.
        logger.info ("Starting occupation add test.");
        IOccupationDao dao = new OccupationDaoJDBC();
    	
    	
        logger.debug("Inserting new occupation.");
        Occupation o1 = new Occupation();
    	Occupation o2 = new Occupation();
    	
    	o1.setName("lala1");
    	o1.setDescription("...");
    	o2.setName("lala2");
    	o2.setDescription("...");
    
    	dao.create(o1);
    	dao.create(o2);

  
    	logger.debug ("Checking test result.");
        List<Occupation> list = dao.findAll ();

        logger.info ("Add new list empty");
        List<Occupation> list2 = new ArrayList<>();
        
        boolean r = Boolean.FALSE;

        if (list.size() != list2.size()) {
                r = Boolean.TRUE;
                
            }
        
        Assert.assertTrue(r);
       
    }
    
    
    
    
    
    
    
    
    
    
    
}