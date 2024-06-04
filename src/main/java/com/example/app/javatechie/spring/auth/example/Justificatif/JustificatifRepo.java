package com.example.app.javatechie.spring.auth.example.Justificatif;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JustificatifRepo extends JpaRepository<Justificatif, Long> {
	Optional<Justificatif> findBySalariesId(int salariesId);
}
