package com.pixeltrice.springbootRestfulAPIhibernatepostgresql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("myImplementation")

@Entity
@Table(name = "vehicle")
public class VehicleEntity1 {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	    private Integer vehicleId;
	    
	    @Column(name = "veh_make", nullable = false)
	    private String make;
	    
	    @Column(name = "veh_model", nullable = false)
	    private String model;
	    
	    @Column(name = "veh_color", nullable = false)
	    private String color;
	 
	    public VehicleEntity1() {
	  
	    }
	 
	    public VehicleEntity1(String make, String model, String color) {
	         this.make = make;
	         this.model = model;
	         this.color = color;
	    }
	 
	   
	    public Integer getVehicleId() {
	        return vehicleId;
	    }
	    public void setVehicleId(Integer vehicleId) {
	        this.vehicleId = vehicleId;
	    }
	 
	   	    public String getMake() {
	        return make;
	    }
	    public void setMake(String make) {
	        this.make = make;
	    }
	 
	   
	    public String getModel() {
	        return model;
	    }
	    public void setModel(String model) {
	        this.model = model;
	    }
	 
	   
	    public String getColor() {
	        return color;
	    }
	    public void setColor(String color) {
	        this.color = color;
	    }

	    @Override
	    public String toString() {
	        return "Vehicle [vehicleId=" + vehicleId + ", make=" + make + ", model=" + model
	       + ", color=" + color + "]";
	    }
	 
	}
