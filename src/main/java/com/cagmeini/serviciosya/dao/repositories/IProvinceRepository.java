package com.cagmeini.serviciosya.dao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cagmeini.serviciosya.beans.entity.CityEntity;
import com.cagmeini.serviciosya.beans.entity.CountryEntity;
import com.cagmeini.serviciosya.beans.entity.ProvinceEntity;


@Repository
public interface IProvinceRepository extends JpaRepository<ProvinceEntity, Integer> {

	
    List<ProvinceEntity> findAllByCountryOrderByNameDesc (CountryEntity country);

	ProvinceEntity findOneByName(String name);

	ProvinceEntity findOneByCountry(CountryEntity c);
	
	List<ProvinceEntity> findAllByCountry(CountryEntity c);
	
	
	@Query (value = 	"SELECT p "+
   						"FROM Province AS p "+
						"INNER JOIN  p.country c WHERE c.id = :id AND c.code = :code")
	ProvinceEntity findOneByCountryCode(@Param("id") Integer id,@Param("code") String code);

	
	
//	   	@Query (value = 	"SELECT c "+
//	   			"FROM City AS c "+"INNER JOIN  c.province p WHERE p.id = :id")
//		List<CityEntity> findAllCitiesByProvinceEntities(@Param("id") Integer id);
}
