package com.example.app.javatechie.spring.auth.example;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@EnableWebSecurity
@Configuration
@EnableWebMvc
@CrossOrigin(origins = "http://localhost:4200")
public class WebConfig implements WebMvcConfigurer {
	//@Override
//	public void addCorsMappings(CorsRegistry registry) {
//		registry.addMapping("/api/**")
//	    .allowedOrigins("http://localhost:4200")
//	    .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS","PATCH")
//	    .allowedHeaders("*")
//	    .allowCredentials(true)
//	    .exposedHeaders("Authorization")
//	    .exposedHeaders("Access-Control-Allow-Origin");
//	}
}