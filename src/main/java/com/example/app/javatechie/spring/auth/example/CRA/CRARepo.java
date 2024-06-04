package com.example.app.javatechie.spring.auth.example.CRA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.app.javatechie.spring.auth.example.CRA.CRA;
import com.example.app.javatechie.spring.auth.example.mission.Mission;


@EnableJpaRepositories
@Repository
public interface CRARepo extends JpaRepository<CRA, Integer> {
	List<CRA> findByMissionId(int id);

}