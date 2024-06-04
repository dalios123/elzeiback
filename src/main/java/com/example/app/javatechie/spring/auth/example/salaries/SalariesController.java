package com.example.app.javatechie.spring.auth.example.salaries;

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
import com.example.app.javatechie.spring.auth.example.salaries.DTOsalaries;
import com.example.app.javatechie.spring.auth.example.salaries.Salaries;
import com.example.app.javatechie.spring.auth.example.salaries.MyServiceSalaries;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/salaries")
public class SalariesController {
	  @Autowired
	   public MyServiceSalaries MyServiceSalaries;


	    @PostMapping("/save")
	    public String saveSalaries(@RequestBody DTOsalaries dto) {
	    	String id=MyServiceSalaries.addSalaries(dto);
	    	return id;      
	    }
	    
	    
	    @GetMapping
	    public List<Salaries> getAll() {
	        return MyServiceSalaries.findAll();
	    }
	    
	    @ResponseBody
	    @GetMapping("{id}")
	    public Salaries get(@PathVariable("id") Integer id) {
	    	return MyServiceSalaries.findById(id);

	    }
	    
	    
	    //Modifier un Salaries

		 @ResponseBody
		    @PutMapping("/update/{id}")

		    public ResponseEntity<Salaries> update(@PathVariable("id") int id, @RequestBody Salaries updatSalaries) {

			Salaries existingSalaries = MyServiceSalaries.findById(id);
		        if (existingSalaries == null) {

		            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		        }
		    	existingSalaries.setPrenom(updatSalaries.getPrenom());
	        	existingSalaries.setNom(updatSalaries.getNom());
	        	existingSalaries.setAdresse(updatSalaries.getAdresse());
	        	existingSalaries.setPays(updatSalaries.getPays());	        	
	        	existingSalaries.setdateNaiss(updatSalaries.getdateNaiss());
	        	existingSalaries.setDateEntre(updatSalaries.getDateEntre());
	        	existingSalaries.setDateSortie(updatSalaries.getDateSortie());
	        	existingSalaries.setCoefficient(updatSalaries.getCoefficient());
	        	existingSalaries.setEmploi(updatSalaries.getEmploi());
	        	existingSalaries.setStatut(updatSalaries.getStatut());
	        	existingSalaries.setPosition(updatSalaries.getPosition());
	        	existingSalaries.setMatricule(updatSalaries.getMatricule());
	        	Salaries c = MyServiceSalaries.save(existingSalaries);
		        return new ResponseEntity<>(c, HttpStatus.OK);
		    }
		   @ResponseBody

		    @DeleteMapping("/deletesalarie/{id}")

		    public void delete(@PathVariable("id") int id) {

			   MyServiceSalaries.delete(id);

		    }
		
		   
		     	   
}
