package com.example.codetest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.codetest.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

	Optional<Customer> findById(int id);
	
}
