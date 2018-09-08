
package com.cagmeini.serviciosya.dao;


import java.util.List;

import com.cagmeini.serviciosya.beans.domain.Occupation;


public interface IOccupationDao {


    List<Occupation> findAllOccupations ();

    void add (Occupation occupation);

	public Occupation searchById(String id);
	
	
}
