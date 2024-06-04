package com.example.app.javatechie.spring.auth.example.monthlydata;

import java.util.List;

import com.example.app.javatechie.spring.auth.example.mission.Mission;

public interface monthlyDataService {
	public String addMonthlyData(monthlyData monthlyData);
	List <monthlyData> findAll();
	monthlyData findById(int id);
	monthlyData save(monthlyData monthlyData);
	monthlyData update(int id, monthlyData updateMonthlyData);
	void delete(int id);
}