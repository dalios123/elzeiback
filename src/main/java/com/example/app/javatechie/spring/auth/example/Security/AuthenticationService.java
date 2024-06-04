package com.example.app.javatechie.spring.auth.example.Security;

import com.example.app.javatechie.spring.auth.example.User.User;

public interface AuthenticationService {
    User Register(User user);

    User findById(Long id);

    AuthenticationResponse authenticate(AuthenticationRequest request);

    User getUserByToken(String token);
}
