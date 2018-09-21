
package com.cagmeini.serviciosya.dao.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.cagmeini.serviciosya.beans.entity.OccupationEntity;


public interface IOccupationDao extends JpaRepository<OccupationEntity, Integer> {



}
