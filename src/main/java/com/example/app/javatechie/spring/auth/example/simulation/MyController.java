package com.example.app.javatechie.spring.auth.example.simulation;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.app.javatechie.spring.auth.example.simulation.DTO;
import com.example.app.javatechie.spring.auth.example.simulation.Simulateur;
import com.example.app.javatechie.spring.auth.example.simulation.MyService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/Simulation")
public class MyController {
	  @Autowired
	   public MyService MyService;
	
	    @PostMapping("/save")
	    public String saveSimulateur(@RequestBody DTO dto) {
	    	String id=MyService.addSimulateur(dto);
	    	return id;      
	    }
	    
	    
	    @GetMapping
	    public List<Simulateur> getAll() {
	        return MyService.findAll();
	    }
	    
	    @ResponseBody
	    @GetMapping("{id}")
	    public Simulateur get(@PathVariable("id") Integer id) {
	    	return MyService.findById(id);

	    }
	  }

