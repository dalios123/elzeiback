package com.example.app.javatechie.spring.auth.example.mission;

import java.util.List;

import com.example.app.javatechie.spring.auth.example.client.Client;
import com.example.app.javatechie.spring.auth.example.salaries.Salaries;


public interface MissionService {

	public String addMission(Mission dto);
	List <Mission> findAll();
	Mission findById(int id);
	Mission save(Mission mission);
	Mission update(int id, Mission updateMission);
	void delete(int id);
	Mission getMissionBySalariesMission(int id);

	Mission getMissionByClientId(int id);
}
