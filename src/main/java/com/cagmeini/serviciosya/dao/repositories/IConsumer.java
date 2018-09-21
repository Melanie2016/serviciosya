package com.cagmeini.serviciosya.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cagmeini.serviciosya.beans.entity.ConsumerEntity;

public interface IConsumer extends JpaRepository<ConsumerEntity,Integer>{

}
