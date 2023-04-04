package com.example.AITUrm_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.AITUrm_backend.repository")
public class AitUrmBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(AitUrmBackEndApplication.class);
	}

}
