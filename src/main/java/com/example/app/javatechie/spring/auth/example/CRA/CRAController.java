package com.example.app.javatechie.spring.auth.example.CRA;

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

import com.example.app.javatechie.spring.auth.example.CRA.CRA;
import com.example.app.javatechie.spring.auth.example.CRA.CRAService;
import com.example.app.javatechie.spring.auth.example.CRA.DTOCRA;
import com.example.app.javatechie.spring.auth.example.client.Client;
import com.example.app.javatechie.spring.auth.example.mission.Mission;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/CRA")
public class CRAController {


	  @Autowired
	   public CRAService CRAService;


	    @PostMapping("/save")
	    public String saveCRA(@RequestBody DTOCRA dto) {
	    	String id=CRAService.addCRA(dto);
	    	return id;      
	    }
	        
	    @GetMapping
	    public List<CRA> getAll() {
	        return CRAService.findAll();
	    }
	    
	    @ResponseBody
	    @GetMapping("{id}")
	    public CRA get(@PathVariable("id") Integer id) {
	    	return CRAService.findById(id);
	    }
	    	    	    	  
	    @ResponseBody
	    @PutMapping("/updateCRA/{id}")

	    public ResponseEntity<CRA> update(@PathVariable("id") int id, @RequestBody CRA updatCRA) {

		CRA existingCRA = CRAService.findById(id);
	        if (existingCRA == null) {

	            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	        }
	        existingCRA.setMission(updatCRA.getMission());
	        existingCRA.setMois(updatCRA.getMois());
	        existingCRA.setNbjour(updatCRA.getNbjour());
	        existingCRA.setMontantH(updatCRA.getMontantH());
	        existingCRA.setMontantTTC(updatCRA.getMontantTTC());	        	       

	        CRA c = CRAService.update(id,updatCRA);
	        return new ResponseEntity<>( c , HttpStatus.OK);
	    }
	 
	   @ResponseBody
	    @DeleteMapping("/deleteCRA/{id}")
	    public void delete(@PathVariable("id") int id) {
		   CRAService.delete(id);
	    }	
	   	   
	   @GetMapping("/user/{id}")
	   public ResponseEntity<List<CRA>> getCraByUserId(@PathVariable("id") int id) {
		   List<CRA> c = CRAService.getCraByMissionId(id);
		   return new ResponseEntity<>( c , HttpStatus.OK);
	   }
}
