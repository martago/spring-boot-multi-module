package com.purnima.jain.customer.service;

import com.purnima.jain.customer.domain.aggregate.Customer;

public interface CustomerService {

	public Customer getCustomerById(Integer customerId);

	Customer addCustomer(String customerName);
}
