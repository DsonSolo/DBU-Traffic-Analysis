package com.pixeltrice.springbootRestfulAPIhibernatepostgresql;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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
//@Component

@RequestMapping("/api/motorist")
public class MotoristController1 {
	
	@Autowired
	MotoristRepository1 motoristRepository;
	
	@GetMapping("/get-all-motorists")
	public List<MotoristEntity1> getAllMotorist(){
		List<MotoristEntity1> allMotoristlist = motoristRepository.findAll();
		return allMotoristlist;
		
	}
	
	@GetMapping("/get-motorist/{id}")
	public MotoristEntity1 getMotoristbyId(@PathVariable(value = "id") Integer motoristId)
      
	{
		MotoristEntity1 motoristEntity = motoristRepository.findById(motoristId).get();
		
		return motoristEntity;	
	}
	
    @PostMapping("/create-motorists")
    public MotoristEntity1 createMotorist(@RequestBody MotoristEntity1 motorist) {
       
    	MotoristEntity1 savedMotorist = motoristRepository.save(motorist);
    	 
    	 return savedMotorist;
    }
    
    @PutMapping("/update-motorists/{id}")
    public ResponseEntity<MotoristEntity1> updateMotorist(@PathVariable(value = "id") Integer motoristId,
         @RequestBody MotoristEntity1 motoristDetails) {
    	MotoristEntity1 motorist = motoristRepository.findById(motoristId).get();

    	motorist.setFirstName(motoristDetails.getFirstName());
    	motorist.setLastName(motoristDetails.getLastName());
    	motorist.setAge(motoristDetails.getAge());
    	motorist.setDriverLicense(motoristDetails.getDriverLicense());
    	motorist.setVehicle(motoristDetails.getVehicle());
        final MotoristEntity1 updatedMotorist = motoristRepository.save(motorist);
        return ResponseEntity.ok(updatedMotorist);
    }
    
    @DeleteMapping("/delete-motorists/{id}")
    public Map<String, Boolean> deleteMotorist(@PathVariable(value = "id") Integer motoristId)
    {
    MotoristEntity1 motorist = motoristRepository.findById(motoristId).get();

        motoristRepository.delete(motorist);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
