package com.javatechie.spring.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DiagnosisServiceApplication {
	
	@GetMapping("/getDiagnosis")
	public String getDoctorService() {
		return "Diagnosis microservice called...";
	}

	public static void main(String[] args) {
		SpringApplication.run(DiagnosisServiceApplication.class, args);
	}
}
