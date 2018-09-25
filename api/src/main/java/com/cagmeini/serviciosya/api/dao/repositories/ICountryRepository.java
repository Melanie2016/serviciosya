package com.cagmeini.serviciosya.api.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cagmeini.serviciosya.api.beans.entity.CountryEntity;


@Repository
public interface ICountryRepository extends JpaRepository<CountryEntity, Integer> {
}
