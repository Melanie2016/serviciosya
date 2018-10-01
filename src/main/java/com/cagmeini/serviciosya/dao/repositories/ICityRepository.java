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
public interface ICityRepository extends JpaRepository<CityEntity, Integer> {

	public final static String FIND_BY_ADDRESS_QUERY = "SELECT c " + 
            "FROM City c LEFT JOIN c.province p " +
            "WHERE p.id = :id";
	
	
	
//	@NamedQuery(
//			  name = "User.findByGroupId",
//			  query =
//			    "SELECT u FROM UserGroup ug " +
//			    "INNER JOIN ug.user u WHERE ug.group_id = :groupId ORDER BY u.lastname"
//			)
	

   CityEntity findOneCityEntityByName(String name);

   @Query (value = 	"SELECT c "+
		   			"FROM City AS c "+"INNER JOIN  c.province p WHERE p.id = :id")
   List<CityEntity> findAllCitiesByProvinceEntities(@Param("id") Integer id);
	
   @Query(FIND_BY_ADDRESS_QUERY)
   public List<CityEntity> findAllCitiesByProvince(@Param("id") Integer id);

   List<CityEntity> findAllByProvinceOrderByNameDesc(ProvinceEntity province);
   
   
   
}
