package com.example.app.javatechie.spring.auth.example.Security;

import com.example.app.javatechie.spring.auth.example.User.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthenticationController {
    private final AuthenticationService service;
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return (service.Register(user));
    }


    @GetMapping("/user/{id}")
    public User GetById(@PathVariable("id") Long id)
    {

        return(service.findById(id));

    }


    @PostMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestBody AuthenticationRequest request
    ) {
        return service.authenticate(request);
    }
    @GetMapping
    public User getUserByToken(@RequestParam String token)
    {
        return service.getUserByToken(token);
    }

}

