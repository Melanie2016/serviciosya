
package com.cagmeini.serviciosya.dao;


import java.util.*;

import com.cagmeini.serviciosya.beans.domain.Occupation;

import static org.apache.commons.lang3.RandomStringUtils.*;



public class OccupationDaoMemory implements IOccupationDao {


    private Map<String, Occupation> occupations;


    public OccupationDaoMemory() {

        super ();

        this.occupations = new TreeMap<>();

        // Load occupations.
        Occupation o1 = new Occupation (randomAlphabetic(5),
                                        "Entandador de Serpientes",
                                    "Entandador de Serpientes");

        Occupation o2 = new Occupation (randomAlphabetic(5),
                                       "Cuidador de Suegras",
                                   "Cuidador de Suegras");

        // Add values to map.
        this.occupations.put (o1.getId (), o1);
        this.occupations.put (o2.getId (), o2);
    }

    
    @Override
    public List<Occupation> findAllOccupations () {

        // Get the entries.
        Set<Map.Entry<String, Occupation>> entries = this.occupations.entrySet ();

        // Build the occupation list.
        List<Occupation> list = new ArrayList<> ();
        for (Map.Entry<String, Occupation> item: entries) {

            list.add (item.getValue ());
        }

        // Return the occupations.
        return list;
    }

    
    @Override
    public void add (Occupation occupation) {

        this.occupations.put (occupation.getId (), occupation);
    }

	  
	@Override
	public void update(String id, String name, String description) {
		
		List<Occupation> lista = findAllOccupations();

		for (Occupation o : lista ) {
			if(o.getId().equals(id))
			{
				o.setName(name);
				o.setDescription(description);
				this.occupations.replace(o.getId(), o);
			}
		}
	}
	
	
	@Override
	public void delete(String id) {
		
		List<Occupation> lista = findAllOccupations();

		for (Occupation o : lista ) {
			if(o.getId().equals(id))
			{
				this.occupations.remove(o.getId(), o);
			}
		}
		
		
	}
	
	
	@Override
	public Occupation searchById(String id) {
		
		Occupation occupationFound = new Occupation() ;
		
		List<Occupation> lista = findAllOccupations();
		
		for (Occupation o : lista ) {
			if(o.getId().equals(id))
			{
				occupationFound.setId(o.getId());
				occupationFound.setName(o.getName());
				occupationFound.setDescription(o.getDescription());
			}
		}
		
		return occupationFound;
	}
	
}