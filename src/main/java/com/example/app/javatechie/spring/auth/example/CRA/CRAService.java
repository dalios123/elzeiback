package com.example.app.javatechie.spring.auth.example.CRA;

import java.util.List;

import com.example.app.javatechie.spring.auth.example.client.Client;
import com.example.app.javatechie.spring.auth.example.mission.Mission;


public interface CRAService {

	public String addCRA(DTOCRA dto);
	List <CRA> findAll();
	CRA findById(Integer id);
	CRA save(CRA CRA);
	CRA update(int id, CRA updateCRA);
	void delete(int id);
	List<CRA> getCraByMissionId(int id);

}

