package com.example.app.javatechie.spring.auth.example.Security;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationResponse {
    private String jwtToken;
}
