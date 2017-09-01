package com.aliu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aliu.model.Customer;
import com.aliu.service.CustomerService;

@RestController
public class APIController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/getallcustomer", method = RequestMethod.GET)
	public List<Customer> getCustomer() {
		List<Customer> custstomer = new ArrayList<>();
		customerService.getAllCustomer().forEach(custstomer::add);
		return custstomer;
	}

	@RequestMapping(value = "/postcustomer", method = RequestMethod.POST)
	public void postCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		return;
	}
	
	@RequestMapping(value = "/getCustomerFirstNameStartWith", method = RequestMethod.POST)
	public List<Customer> getCustomerFirstNameStartWith(@RequestBody Customer customer) {
		System.out.println("API Controller " + customer.getFirstName().toString());
		List<Customer> custstomers = new ArrayList<>();
		customerService.getCustomerFirstNameStartWith(customer).forEach(custstomers::add);
		return custstomers;
	}

}
