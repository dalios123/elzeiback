package com.example.app.javatechie.spring.auth.example.Security;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static org.springframework.http.HttpMethod.*;
import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
@EnableMethodSecurity
public class SecurityConfig {

    private final AuthenticationProvider authenticationProvider;
    private final JwtFilter jwtAuthFilter;
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(req ->
                        req.requestMatchers("/api/auth/**")
                                .permitAll()
                                .requestMatchers(GET,"/api/Simulation/**").hasAnyAuthority("ROLE_Admin","ROLE_ConsultantRH","ROLE_Comercial","ROLE_SupportTechnique")
                                .requestMatchers(POST,"/api/Simulation/**").hasAnyAuthority("ROLE_Admin","ROLE_ConsultantRH","ROLE_Comercial")

                                .requestMatchers(GET,"/api/salaries/**").hasAnyAuthority("ROLE_Admin","ROLE_ConsultantRH","ROLE_SupportTechnique")
                                .requestMatchers(POST,"/api/salaries/**").hasAnyAuthority("ROLE_Admin","ROLE_ConsultantRH")
                                .requestMatchers(PUT,"/api/salaries/**").hasAnyAuthority("ROLE_Admin","ROLE_ConsultantRH")
                                .requestMatchers(DELETE,"/api/salaries/**").hasAnyAuthority("ROLE_Admin","ROLE_ConsultantRH")

                                .requestMatchers(GET,"/api/Client/**").hasAnyAuthority("ROLE_Admin","ROLE_ConsultantRH","ROLE_SupportTechnique")
                                .requestMatchers(POST,"/api/Client/**").hasAnyAuthority("ROLE_Admin")
                                .requestMatchers(PUT,"/api/Client/**").hasAnyAuthority("ROLE_Admin")
                                .requestMatchers(DELETE,"/api/Client/**").hasAnyAuthority("ROLE_Admin")

                                .requestMatchers(GET,"/api/Mission/**").hasAnyAuthority("ROLE_Admin","ROLE_ConsultantRH","ROLE_SupportTechnique")
                                .requestMatchers(POST,"/api/Mission/**").hasAnyAuthority("ROLE_Admin","ROLE_ConsultantRH")
                                .requestMatchers(PUT,"/api/Mission/**").hasAnyAuthority("ROLE_Admin","ROLE_ConsultantRH")
                                .requestMatchers(DELETE,"/api/Mission/**").hasAnyAuthority("ROLE_Admin","ROLE_ConsultantRH")

                                .requestMatchers(GET,"/api/CRA/**").hasAnyAuthority("ROLE_Admin","ROLE_ConsultantRH","ROLE_SupportTechnique")
                                .requestMatchers(POST,"/api/CRA/**").hasAnyAuthority("ROLE_Admin","ROLE_ConsultantRH")
                                .requestMatchers(PUT,"/api/CRA/**").hasAnyAuthority("ROLE_Admin","ROLE_ConsultantRH")
                                .requestMatchers(DELETE,"/api/CRA/**").hasAnyAuthority("ROLE_Admin","ROLE_ConsultantRH")

                                .requestMatchers(GET,"/api/monthlyData/**").hasAnyAuthority("ROLE_Admin","ROLE_ConsultantRH","ROLE_SupportTechnique")
                                .requestMatchers(POST,"/api/monthlyData/**").hasAnyAuthority("ROLE_Admin","ROLE_ConsultantRH")
                                .requestMatchers(PUT,"/api/monthlyData/**").hasAnyAuthority("ROLE_Admin","ROLE_ConsultantRH")
                                .requestMatchers(DELETE,"/api/monthlyData/**").hasAnyAuthority("ROLE_Admin","ROLE_ConsultantRH")

                                .requestMatchers(POST,"/api/v1/test/justificatif/fill-pdf**").hasAnyAuthority("ROLE_Admin")




                                .anyRequest()
                                .authenticated()
                )
                .sessionManagement(session -> session.sessionCreationPolicy(STATELESS))
                .authenticationProvider(authenticationProvider)
               .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)

        ;

        return http.build();
    }
}
