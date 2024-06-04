package com.example.app.javatechie.spring.auth.example.simulation;


import java.util.List;


import com.example.app.javatechie.spring.auth.example.simulation.DTO;
import com.example.app.javatechie.spring.auth.example.simulation.Simulateur;

public interface MyService{


	public String addSimulateur(DTO dTO);
	List <Simulateur> findAll();
	Simulateur findById(Integer id);
	

	

	
}
