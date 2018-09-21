package com.cagmeini.serviciosya.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cagmeini.serviciosya.beans.entity.CountryEntity;

public interface ICountryDao extends JpaRepository<CountryEntity, Integer> {
}
