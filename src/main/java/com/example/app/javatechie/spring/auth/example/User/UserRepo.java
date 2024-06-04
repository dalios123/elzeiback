package com.example.app.javatechie.spring.auth.example.User;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByName(String username);

}