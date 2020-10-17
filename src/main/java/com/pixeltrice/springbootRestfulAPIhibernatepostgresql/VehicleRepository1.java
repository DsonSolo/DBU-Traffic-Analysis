package com.pixeltrice.springbootRestfulAPIhibernatepostgresql;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

    @Repository
    @Service
    @Qualifier("myImplementation")
   public interface VehicleRepository1 extends JpaRepository<VehicleEntity1, Integer>{

	}
