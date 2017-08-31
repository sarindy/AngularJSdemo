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
		List<Customer> cust = new ArrayList<>();
		customerService.getAllCustomer().forEach(cust::add);
		return cust;
	}

	@RequestMapping(value = "/postcustomer", method = RequestMethod.POST)
	public void postCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		return;
	}

}
