package com.cagmeini.serviciosya.api.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cagmeini.serviciosya.api.beans.entity.ServiceEntity;


@Repository
public interface IServiceRepository extends JpaRepository<ServiceEntity,Integer>{

}
