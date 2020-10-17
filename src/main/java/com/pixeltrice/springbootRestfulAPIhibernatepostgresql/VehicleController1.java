package com.pixeltrice.springbootRestfulAPIhibernatepostgresql;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component

@RequestMapping("/api/vehicle")
public class VehicleController1 {
	
	@Autowired
	@Qualifier("myImplementation")
	
	VehicleRepository1 vehicleRepository;
	
	@GetMapping("/get-all-vehicles")
	public List<VehicleEntity1> getAllVehicle(){
		List<VehicleEntity1> allVehiclelist = vehicleRepository.findAll();
		return allVehiclelist;
		
	}
	
	@GetMapping("/get-vehicle/{id}")
	public VehicleEntity1 getVehiclebyId(@PathVariable(value = "id") Integer vehicleId)
      
	{
		VehicleEntity1 vehicleEntity = vehicleRepository.findById(vehicleId).get();
		
		return vehicleEntity;	
	}
	
    @PostMapping("/create-vehicles")
    public VehicleEntity1 createVehicle(@RequestBody VehicleEntity1 vehicle) {
       
    	 VehicleEntity1 savedVehicle = vehicleRepository.save(vehicle);
    	 
    	 return savedVehicle;
    }
    
    @PutMapping("/update-vehicles/{id}")
    public ResponseEntity<VehicleEntity1> updateVehicle(@PathVariable(value = "id") Integer vehicleId,
         @RequestBody VehicleEntity1 vehicleDetails) {
    	VehicleEntity1 vehicle = vehicleRepository.findById(vehicleId).get();

        vehicle.setMake(vehicleDetails.getMake());
        vehicle.setModel(vehicleDetails.getModel());
        vehicle.setColor(vehicleDetails.getColor());
        final VehicleEntity1 updatedVehicle = vehicleRepository.save(vehicle);
        return ResponseEntity.ok(updatedVehicle);
    }
    
    @DeleteMapping("/delete-vehicles/{id}")
    public Map<String, Boolean> deleteVehicle(@PathVariable(value = "id") Integer vehicleId)
    {
    	VehicleEntity1 vehicle = vehicleRepository.findById(vehicleId).get();

     	vehicleRepository.delete(vehicle);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}

