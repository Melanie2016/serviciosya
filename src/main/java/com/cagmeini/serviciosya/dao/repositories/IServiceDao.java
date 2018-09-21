package com.cagmeini.serviciosya.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cagmeini.serviciosya.beans.entity.ServiceEntity;


@Repository
public interface IServiceDao extends JpaRepository<ServiceEntity,Integer>{

}
