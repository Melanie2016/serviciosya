package com.cagmeini.serviciosya.dao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cagmeini.serviciosya.beans.entity.ServiceEntity;


@Repository
public interface IServiceRepository extends JpaRepository<ServiceEntity,Integer>{

	
	ServiceEntity findOneById (Integer id );
	
	
//	https://stackoverflow.com/questions/10802798/spring-data-jpa-query-with-parameter-properties
//	@Query("select u from User u where u.firstname = :#{#customer.firstname}")
//	List<User> findUsersByCustomersFirstname(@Param("customer") Customer customer);
	
//	@Query("SELECT u FROM id = 15") 
//	ServiceEntity findServiceByConsumerEntityId();
	
	
	
//	List<ProvinceEntity> findAllByCountryOrderByNameDesc (CountryEntity country);
	
}
