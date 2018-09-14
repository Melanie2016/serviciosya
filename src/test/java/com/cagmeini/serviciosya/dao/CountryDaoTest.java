package com.cagmeini.serviciosya.dao;

import com.cagmeini.serviciosya.beans.entity.CountryEntity;
import com.cagmeini.serviciosya.dao.interfaces.ICountryDao;
import com.cagmeini.serviciosya.dao.orm.CountryDaoHibernate;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CountryDaoTest {

    private ICountryDao dao = new CountryDaoHibernate();


    @Test
    public void testCreate () {

        CountryEntity c = new CountryEntity ();
        c.setName ("Brasil");
        this.dao.create (c);

        Assert.assertNotNull ("Failure creating new country.", c.getId ());
    }

    @Test
    public void testUpdate () {

        CountryEntity c = new CountryEntity ();
        c.setId (3);
        c.setName ("ARGENTINA");
        this.dao.update (c);

        Assert.assertEquals ("Failure updating country.", "ARGENTINA", c.getName ());
    }

    @Test
    public void testDelete () {

        int id = 4;
        this.dao.delete (id);

        CountryEntity c = this.dao.findById (id);

        Assert.assertNull ("Failure deleting country.", c);
    }

    @Test
    public void testFindAll () {

        List<CountryEntity> list = this.dao.findAll ();

        list.forEach (System.out::println);

        Assert.assertFalse ("Failure find all countries.", list.isEmpty ());
    }
}
