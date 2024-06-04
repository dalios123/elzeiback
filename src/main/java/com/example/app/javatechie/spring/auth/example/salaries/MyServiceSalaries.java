package com.example.app.javatechie.spring.auth.example.salaries;


import java.util.List;

import com.example.app.javatechie.spring.auth.example.mission.Mission;
import com.example.app.javatechie.spring.auth.example.salaries.DTOsalaries;
import com.example.app.javatechie.spring.auth.example.salaries.Salaries;

public interface MyServiceSalaries{

	public String addSalaries(DTOsalaries dto);
	List <Salaries> findAll();
	Salaries findById(Integer id);
	Salaries update(int id, Salaries updateSalaries);
	Salaries save(Salaries Salaries);
	void delete(int id);

}    