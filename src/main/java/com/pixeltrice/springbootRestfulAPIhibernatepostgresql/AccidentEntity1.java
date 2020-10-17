package com.pixeltrice.springbootRestfulAPIhibernatepostgresql;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "accident")
public class AccidentEntity1 {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	    private Integer accidentId;
	    
	    @Column(name = "acc_address", nullable = false)
	    private String address;
	    
	    @Column(name = "vehicle_id", nullable = false)
	    private Integer vehicleA;
	    
	    @OneToMany(mappedBy = "accidentId")
	    private Set<VehicleEntity1> vehicle;
	   
	    public AccidentEntity1() {
	  
	    }
	 
	    public AccidentEntity1(String address, Integer vehicleA) {
	         this.address = address;
	         this.vehicleA = vehicleA;
	    }
	 
	   
	    public Integer getAccidentId() {
	        return accidentId;
	    }
	    public void setAccidentId(Integer accidentId) {
	        this.accidentId = accidentId;
	    }	
        public String getAddress() {
	        return address;
	    }
	    public void setAddress(String address) {
	        this.address = address;
	    }
	 
	    public Integer getVehicle() {
	        return vehicleA;
	    }
	    public void setVehicle(Integer vehicleA) {
	        this.vehicleA = vehicleA;
	    }
   public String toString() {
return "Accident [accidentId=" + accidentId + ", address=" + address + ",   vehicle=" + vehicleA
	       + "]";
	    }
	 
	}

