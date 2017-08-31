package com.aliu.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aliu.model.Customer;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {
	
	

}
