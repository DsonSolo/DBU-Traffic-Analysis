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

@RequestMapping("/api/accident")

public class AccidentController1 {
	
	@Autowired
	AccidentRepository1 accidentRepository;
	
	@GetMapping("/get-all-accidents")
	public List<AccidentEntity1> getAllAccident(){
		List<AccidentEntity1> allAccidentlist = accidentRepository.findAll();
		return allAccidentlist;
		
	}
	
	@GetMapping("/get-accident/{id}")
	public AccidentEntity1 getAccidentbyId(@PathVariable(value = "id") Integer accidentId)
      
	{
		AccidentEntity1 accidentEntity = accidentRepository.findById(accidentId).get();
		
		return accidentEntity;	
	}
	
    @PostMapping("/create-accidents")
    public AccidentEntity1 createAccident(@RequestBody AccidentEntity1 accident) {
       
    	AccidentEntity1 savedAccident = accidentRepository.save(accident);
    	 
    	 return savedAccident;
    }
    
    @PutMapping("/update-accidents/{id}")
    public ResponseEntity<AccidentEntity1> updateAccident(@PathVariable(value = "id") Integer accidentId,
         @RequestBody AccidentEntity1 accidentDetails) {
    	AccidentEntity1 accident = accidentRepository.findById(accidentId).get();

    	accident.setAddress(accidentDetails.getAddress());
    	accident.setVehicle(accidentDetails.getVehicle());
        final AccidentEntity1 updatedAccident = accidentRepository.save(accident);
        return ResponseEntity.ok(updatedAccident);
    }
    
    @DeleteMapping("/delete-accidents/{id}")
    public Map<String, Boolean> deleteAccident(@PathVariable(value = "id") Integer accidentId)
    {
    	AccidentEntity1 accident = accidentRepository.findById(accidentId).get();

    	accidentRepository.delete(accident);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}

