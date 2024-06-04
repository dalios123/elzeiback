package com.example.app.javatechie.spring.auth.example.simulation;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.app.javatechie.spring.auth.example.simulation.Simulateur;
@EnableJpaRepositories
@Repository
public interface SimulateurRepository extends JpaRepository<Simulateur, Integer> {
}