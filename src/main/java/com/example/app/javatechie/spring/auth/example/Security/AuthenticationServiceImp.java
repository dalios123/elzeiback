package com.example.app.javatechie.spring.auth.example.Security;

import com.example.app.javatechie.spring.auth.example.User.User;
import com.example.app.javatechie.spring.auth.example.User.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AuthenticationServiceImp implements AuthenticationService{

    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtService  jwtService;


    @Override
    public User Register(User user)
    {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);

    }

    @Override
    public User findById(Long id)
    {
        Optional<User> student= userRepo.findById(id);
        if(student.isPresent())
            return student.get();

        throw new RuntimeException("User not found with id " + id);
    }
    @Override
    public AuthenticationResponse authenticate(AuthenticationRequest request) {


            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.getName(),
                            request.getPassword()
                    )
            );


        User user=userRepo.findByName(request.getName()).orElseThrow(() -> new RuntimeException("NO user with the name"+request.getName()));
        String jwtToken = jwtService.generateToken(user);

        return new AuthenticationResponse(jwtToken);

    }
    @Override
    public User getUserByToken(String token)
    {
        String userName=jwtService.extractUsername(token);
        return userRepo.findByName(userName).orElseThrow(() -> new RuntimeException("NO user with the name"+userName));
    }

}
