
package com.cagmeini.serviciosya.service;


import java.util.List;

import com.cagmeini.serviciosya.beans.domain.Occupation;
import com.cagmeini.serviciosya.dao.IOccupationDao;


public class OccupationService {


    private IOccupationDao occupationDao;


    public OccupationService () {

        super ();
    }

    public OccupationService (IOccupationDao occupationDao) {

        super ();

        this.occupationDao = occupationDao;
    }

    public void setOccupationDao(IOccupationDao occupationDao) {

        this.occupationDao = occupationDao;
    }

   
    
    
    public List<Occupation> findAllOccupations () {

        return this.occupationDao.findAllOccupations ();
    }

    
    
    public void addOccupation (Occupation occupation) {

        this.occupationDao.add (occupation);
    }
    
    
    
    public Occupation searchByIdService(String id) {
    	return this.occupationDao.searchById(id);
    }
    
    
    
}