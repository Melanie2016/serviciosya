package com.cagmeini.serviciosya.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cagmeini.serviciosya.beans.entity.CityEntity;

public interface ICityRepository extends JpaRepository<CityEntity, Integer> {
	
	

}