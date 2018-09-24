package com.cagmeini.serviciosya.dao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cagmeini.serviciosya.beans.entity.CountryEntity;
import com.cagmeini.serviciosya.beans.entity.ProvinceEntity;


@Repository
public interface IProvinceRepository extends JpaRepository<ProvinceEntity, Integer> {

	
    List<ProvinceEntity> findAllByCountryOrderByNameDesc (CountryEntity country);

}
