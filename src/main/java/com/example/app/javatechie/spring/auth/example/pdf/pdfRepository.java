package com.example.app.javatechie.spring.auth.example.pdf;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.example.app.javatechie.spring.auth.example.pdf.Pdf;
@EnableJpaRepositories
@Repository
public interface pdfRepository extends JpaRepository<Pdf, Integer> {
	}


