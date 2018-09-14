package com.cagmeini.serviciosya.jdbc;

import com.cagmeini.serviciosya.beans.domain.Occupation;
import com.cagmeini.serviciosya.dao.interfaces.IOccupationDao;
import com.cagmeini.serviciosya.dao.jdbc.IOccupationDaoJDBC;
import com.cagmeini.serviciosya.dao.jdbc.OccupationDaoJDBC;
import com.cagmeini.serviciosya.service.test.OccupationServiceTest;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class OccupationTest {


    private static final Logger logger = Logger.getLogger (OccupationServiceTest.class);


    @Test
    public void testAdd () {

        try {

            // Insert new value.
            logger.info ("Starting occupation add test.");
            IOccupationDaoJDBC dao = new OccupationDaoJDBC();

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
