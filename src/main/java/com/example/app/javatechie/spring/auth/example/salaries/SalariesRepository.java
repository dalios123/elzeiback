package com.example.app.javatechie.spring.auth.example.salaries;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.app.javatechie.spring.auth.example.mission.Mission;
import com.example.app.javatechie.spring.auth.example.salaries.Salaries;

@EnableJpaRepositories
@Repository
public interface SalariesRepository extends JpaRepository<Salaries, Integer> {
}