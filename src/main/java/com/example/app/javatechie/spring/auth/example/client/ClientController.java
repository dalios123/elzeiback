package com.example.app.javatechie.spring.auth.example.client;

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

import com.example.app.javatechie.spring.auth.example.salaries.Salaries;






@CrossOrigin("*")
@RestController
@RequestMapping("/api/Client")
public class ClientController {


	  @Autowired
	   public ClientService ClientService;


	    @PostMapping("/save")
	    public String saveClient(@RequestBody DTOclient dto) {
	    	String id=ClientService.addClient(dto);
	    	return id;      
	    }
	    
	    
	    @GetMapping
	    public List<Client> getAll() {
	        return ClientService.findAll();
	    }
	    
	    @ResponseBody
	    @GetMapping("{id}")
	    public Client get(@PathVariable("id") int id) {
	    	return ClientService.findById(id);
	    }
	    
	    
		 @ResponseBody
		    @PutMapping("/updateclient/{id}")

		    public ResponseEntity<Client> update(@PathVariable("id") int id, @RequestBody Client updatClient) {

			Client existingClient = ClientService.findById( id);
		        if (existingClient == null) {

		            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		        }
		        existingClient.setLibelle(updatClient.getLibelle());
		        existingClient.setNumtva(updatClient.getNumtva());
		        existingClient.setAddress(updatClient.getAddress());
		        existingClient.setPays(updatClient.getPays());	        	       
		        Client c = ClientService.update(id,updatClient);
		        return new ResponseEntity<>( c , HttpStatus.OK);
		    }
		 
		   @ResponseBody

		    @DeleteMapping("/deleteclient/{id}")

		    public void delete(@PathVariable("id") int id) {

			   ClientService.delete(id);

		    }	    	    
	    
	    }
