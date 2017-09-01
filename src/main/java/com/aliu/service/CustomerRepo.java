package com.aliu.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aliu.model.Customer;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {
	
	public List<Customer> findByfirstNameStartingWith(String firstName);
	
	public List<Customer> findBylastNameStartingWith(String lastName);
	
	

}
