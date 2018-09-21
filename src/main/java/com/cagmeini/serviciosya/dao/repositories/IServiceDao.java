package com.cagmeini.serviciosya.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cagmeini.serviciosya.beans.entity.ServiceEntity;

public interface IServiceDao extends JpaRepository<ServiceEntity,Integer>{

}
