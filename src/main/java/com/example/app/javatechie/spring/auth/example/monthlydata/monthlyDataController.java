package com.example.app.javatechie.spring.auth.example.monthlydata;

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





@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/monthlyData")
public class monthlyDataController {


	  @Autowired
	   public monthlyDataService monthlyDataService;


	    @PostMapping("/save")
	    public String saveMonthlyDataService(@RequestBody monthlyData monthlyData) {
	    	String id=monthlyDataService.addMonthlyData(monthlyData);
	    	return id;      
	    }
	    
	    
	    @GetMapping
	    public List<monthlyData> getAll() {
	        return monthlyDataService.findAll();
	    }
	    
	    @ResponseBody
	    @GetMapping("{id}")
	    public monthlyData get(@PathVariable("id") int id) {
	    	return monthlyDataService.findById(id);
	    }
	    
	    
	    
	    @ResponseBody
	    @PutMapping("/updateMonthlyData/{id}")

	    public ResponseEntity<monthlyData> update(@PathVariable("id") int id, @RequestBody monthlyData updatMonthlyData) {

	    	monthlyData existingMonthlyData = monthlyDataService.findById(id);
	        if (existingMonthlyData == null) {

	            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	        }
	        existingMonthlyData.setAutre(updatMonthlyData.getAutre());
	        existingMonthlyData.setCout(updatMonthlyData.getCout());
	        existingMonthlyData.setFacture(updatMonthlyData.getFacture());
	        existingMonthlyData.setTotalPercu(updatMonthlyData.getTotalPercu());
	        existingMonthlyData.setCraid(updatMonthlyData.getCraid());
	        existingMonthlyData.setMissionid(updatMonthlyData.getMissionid());
	        existingMonthlyData.setSalariesid(updatMonthlyData.getSalariesid());

	        
	        monthlyData c = monthlyDataService.update(id,updatMonthlyData);
	        return new ResponseEntity<>( c , HttpStatus.OK);
	    }
	 
	   @ResponseBody

	    @DeleteMapping("/deleteMonthlyData/{id}")

	    public void delete(@PathVariable("id") int id) {

		   monthlyDataService.delete(id);

	    }	 
	   
	   
	   }
	   

