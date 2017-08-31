package com.aliu.service;

import java.util.List;

import com.aliu.model.Customer;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
	
	public List<Customer> getAllCustomer();

}
