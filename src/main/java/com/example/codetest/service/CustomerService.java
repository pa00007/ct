package com.example.codetest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.codetest.entity.Customer;
import com.example.codetest.repository.CustomerRepository;

import java.util.Optional;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public String generatedGreeting(int id, String greeting) {
		
		Optional<Customer> optCustomer = customerRepository.findById(id);	
	
		if (optCustomer.isEmpty()) {
			return "Error:404";
		} else {
			Customer customer = optCustomer.get();
			return greeting + " " + customer.getFirstName() + " " + customer.getLastName() + " !";
		}
	}
	
	public void addCustomer(String firstName, String lastName) {
		Customer customer = new Customer();
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customerRepository.save(customer);
	}
}
