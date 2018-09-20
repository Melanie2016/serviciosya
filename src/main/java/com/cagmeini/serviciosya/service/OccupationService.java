
package com.cagmeini.serviciosya.service;


import com.cagmeini.serviciosya.dao.repositories.IOccupationDao;


public class OccupationService {


    private IOccupationDao occupationDao;


    public OccupationService () {

        super ();
    }

    public OccupationService (IOccupationDao occupationDao) {

        super ();

        this.occupationDao = occupationDao;
    }

}