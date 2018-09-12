
package com.cagmeini.serviciosya.service.test;

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
    
}