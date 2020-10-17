package com.pixeltrice.springbootRestfulAPIhibernatepostgresql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
   public interface AccidentRepository1 extends JpaRepository<AccidentEntity1, Integer>{

	}
