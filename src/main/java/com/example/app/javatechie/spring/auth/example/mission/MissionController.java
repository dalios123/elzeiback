package com.example.app.javatechie.spring.auth.example.mission;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.javatechie.spring.auth.example.mission.Mission;
import com.example.app.javatechie.spring.auth.example.mission.MissionService;
import com.example.app.javatechie.spring.auth.example.salaries.Salaries;
import com.example.app.javatechie.spring.auth.example.client.Client;
import com.example.app.javatechie.spring.auth.example.mission.DTOmission;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/Mission")
public class MissionController {


	  @Autowired
	   public MissionService missionService;


	    @PostMapping("/save")
	    public String saveMission(@RequestBody Mission dto) {
	    	String id=missionService.addMission(dto);
	    	return id;      
	    }
	    
	    
	    @GetMapping
	    public List<Mission> getAll() {
	        return missionService.findAll();
	    }
	    
	    @ResponseBody
	    @GetMapping("{id}")
	    public Mission get(@PathVariable("id") int id) {
	    	return missionService.findById(id);
	    }
	    
	    
	    
	    @ResponseBody
	    @PutMapping("/updateMission/{id}")

	    public ResponseEntity<Mission> update(@PathVariable("id") int id, @RequestBody Mission updatMission) {

	    	Mission existingMission = missionService.findById( id);
	        if (existingMission == null) {

	            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	        }
	        existingMission.setCodemission(updatMission.getCodemission());
	        existingMission.setDatedebut(updatMission.getDatedebut());
	        existingMission.setDatefin(updatMission.getDatefin());
	        existingMission.setTjm(updatMission.getTjm());
	        existingMission.setClientid(updatMission.getClientid());
	        existingMission.setSalariesid(updatMission.getSalariesid());	        	       
	        Mission c = missionService.update(id,updatMission);
	        return new ResponseEntity<>( c , HttpStatus.OK);
	    }
	 
	   @ResponseBody

	    @DeleteMapping("/deletemission/{id}")

	    public void delete(@PathVariable("id") int id) {

		   missionService.delete(id);

	    }	 
	   
	   @GetMapping("/user/{id}")
	   public ResponseEntity<Mission> getMissionByUserId(@PathVariable("id") int id) {
		   Mission c = missionService.getMissionBySalariesMission(id);
		   return new ResponseEntity<>( c , HttpStatus.OK);
	   }
	@GetMapping("/client/{id}")
	public ResponseEntity<Mission> getMissionByClientId(@PathVariable("id") int id) {
		Mission c = missionService.getMissionByClientId(id);
		return new ResponseEntity<>( c , HttpStatus.OK);
	}
	   
	  
	   
	   }
	   

