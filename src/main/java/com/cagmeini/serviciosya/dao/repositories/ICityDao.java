package com.cagmeini.serviciosya.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cagmeini.serviciosya.beans.entity.CityEntity;


@Repository
public interface ICityDao extends JpaRepository<CityEntity, Integer> {



   CityEntity findOneCityEntityByName(String name);
	
//	@Query (value = "SELECT * FROM city c JOIN province p ON c.id = p.?1",
//	           nativeQuery = true)
//	List<CityEntity> findAllCitiesByProvinceEntities(Integer id);

	
	

}
