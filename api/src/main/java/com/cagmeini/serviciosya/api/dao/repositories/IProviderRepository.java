package com.cagmeini.serviciosya.api.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cagmeini.serviciosya.api.beans.entity.ProviderEntity;


@Repository
public interface IProviderRepository extends JpaRepository<ProviderEntity, Integer> {





//    ProviderEntity findByEmail (String email);
//
//    ProviderEntity findByDni (Integer dni);
//
//    ProviderEntity findByPhone (String phone);
}
