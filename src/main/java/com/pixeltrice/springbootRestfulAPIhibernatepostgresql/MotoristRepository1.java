package com.pixeltrice.springbootRestfulAPIhibernatepostgresql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

	@Repository
	//@NoRepositoryBean
	//@Component
	//@Service
   public interface MotoristRepository1 extends JpaRepository<MotoristEntity1, Integer>{

	}
