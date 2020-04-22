




package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//localhost:5000/authenticate = post
//http://localhost:5000/hello-world
//http://localhost:5000/jpa/users/in28minutes/todos


//localhost:5000/authenticate
//http://localhost:5000/hello-world
//http://localhost:5000/jpa/users/in28minutes/todos




@SpringBootApplication
public class RestfulWebServicesApplication {

	// AWS
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("*").allowedOrigins("*");
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}
}
