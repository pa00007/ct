package com.example.codetest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.codetest.service.CustomerService;

@SpringBootApplication
public class CodeTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeTestApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner createDb(CustomerService customerService) {
		
		return (args) -> {
			customerService.addCustomer("Jack", "Bauer");
			customerService.addCustomer("Chloe", "O'Brian");
			customerService.addCustomer("Kim", "Bauer");
			customerService.addCustomer("Michelle", "Dessler");	
		};
	}
	
}
