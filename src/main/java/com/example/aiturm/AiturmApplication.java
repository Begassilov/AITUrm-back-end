package com.example.aiturm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.aiturm.repository")
public class AiturmApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiturmApplication.class);
	}

}
