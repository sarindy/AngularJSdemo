package com.aliu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliu.model.Customer;

@Service
public class CustomerServiceImplement implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public Customer addCustomer(Customer customer) {
		customerRepo.save(customer);
		return customer;
	}

	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> customerList = new ArrayList<>();
		customerRepo.findAll().forEach(customerList::add);
		return customerList;
	}

}
