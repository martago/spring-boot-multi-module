package com.purnima.jain.customer.controller;

import com.purnima.jain.customer.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import com.purnima.jain.customer.domain.aggregate.Customer;

@RestController
public class CustomerController {

	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

	private final CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	// No DTO, because it's just a test case :)
	@PostMapping("customer/{customerName}")
	public Customer addCustomer(@PathVariable String customerName) {
		return customerService.addCustomer(customerName);
	}

	@GetMapping("customer/{customerId}")
	public Customer getCustomer(@PathVariable Integer customerId) {
		logger.info("Inside CustomerController........");
		return customerService.getCustomerById(customerId);
	}

}
