package com.example.app.javatechie.spring.auth.example.monthlydata;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.app.javatechie.spring.auth.example.mission.Mission;

public interface monthlyDataRepo extends JpaRepository<monthlyData, Integer> {


}
