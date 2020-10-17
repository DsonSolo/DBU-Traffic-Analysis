package com.pixeltrice.springbootRestfulAPIhibernatepostgresql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "motorist")
public class MotoristEntity1 {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	    private Integer motoristId;
	    
	    @Column(name = "mot_firstname", nullable = false)
	    private String firstname;
	    
	    @Column(name = "mot_lastname", nullable = false)
	    private String lastname;
	    
	    @Column(name = "mot_age", nullable = false)
	    private Integer age;
	    
	    @Column(name = "mot_driverlicense", nullable = false)
	    private String driverlicense;
	    
	    @Column(name = "vehicle_id", nullable = false)
	    private Integer vehicleB;
	    
	    @ManyToOne
	    @JsonIgnore

	    private VehicleEntity1 vehicle;
	 
	    public MotoristEntity1() {
	  
	    }
	 
	    public MotoristEntity1(String firstname, String lastname, Integer age, String driverlicense, Integer vehicleB) {
	         this.firstname = firstname;
	         this.lastname = lastname;
	         this.age = age;
	         this.driverlicense = driverlicense;
	         this.vehicleB = vehicleB;
	    }
	 
	   
	    public Integer getMotoristId() {
	        return motoristId;
	    }
	    public void setMotoristId(Integer motoristId) {
	        this.motoristId = motoristId;
	    }
	 
	   	public String getFirstName() {
	        return firstname;
	    }
	    public void setFirstName(String firstname) {
	        this.firstname = firstname;
	    }
	 
	    public String getLastName() {
	        return lastname;
	    }
	    public void setLastName(String lastname) {
	        this.lastname = lastname;
	    }
	    
	    public Integer getAge() {
	        return age;
	    }
	    public void setAge(Integer age) {
	        this.age = age;
	    }
	    
	    public String getDriverLicense() {
	        return driverlicense;
	    }
	    public void setDriverLicense(String driverlicense) {
	        this.driverlicense = driverlicense;
	    }
	 
	    public Integer getVehicle() {
	        return vehicleB;
	    }
	    public void setVehicle(Integer vehicleB) {
	        this.vehicleB = vehicleB;
	    }

	    @Override
	    public String toString() {
	        return "Motorist [motoristId=" + motoristId + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", driverlicense=" + driverlicense + ", vehicle=" + vehicleB 
	       + "]";
	    }
	 
	}
