package com.cagmeini.serviciosya.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cagmeini.serviciosya.beans.entity.AvailabilityEntity;



@Repository
public interface IAvailabilityRepository extends JpaRepository<AvailabilityEntity,Integer> {

//	AvailabilityEntity findOneAvailabilityEntityByDayOfAttention(String name);
	
//	List<AvailabilityEntity> findAllByProvidersOrderByNameDesc (ProviderEntity provider);
	
	
	
}
