package com.example.codetest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.codetest.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("customer/{id}/generateGreeting")
	public String generateGreeting(@PathVariable Integer id, @RequestParam (required = false) String greeting) {

		if (greeting == null || greeting.isEmpty()) {
			return customerService.generatedGreeting(id, "Hi");
		} else {
			return customerService.generatedGreeting(id, greeting);
		}
	}
}
