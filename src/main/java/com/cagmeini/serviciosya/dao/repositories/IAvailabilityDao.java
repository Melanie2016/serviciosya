package com.cagmeini.serviciosya.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cagmeini.serviciosya.beans.entity.AvailabilityEntity;

public interface IAvailabilityDao extends JpaRepository<AvailabilityEntity,Integer> {

	

}
