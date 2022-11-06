package com.purnima.jain.customer.service.implementation;

import com.purnima.jain.customer.repository.CustomerEntityRepository;
import com.purnima.jain.customer.repository.model.CustomerEntity;
import com.purnima.jain.customer.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.purnima.jain.customer.domain.aggregate.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

	private final CustomerEntityRepository repo;

	public CustomerServiceImpl(CustomerEntityRepository repo) {
		this.repo = repo;
	}

	@Override
	public Customer getCustomerById(Integer customerId) {
		logger.info("Inside CustomerServiceImpl....getCustomerById....");
		CustomerEntity customer = repo.getCustomerEntityByCustomerId((long) customerId);
		return new Customer((int) customer.getCustomerId(), customer.getCustomerName());
	}

	@Override
	public Customer addCustomer(String customerName) {
		logger.info("Inside CustomerServiceImpl....addCustomer....");
		CustomerEntity customerEntity = repo.save(new CustomerEntity(customerName));
		return new Customer((int) customerEntity.getCustomerId(), customerEntity.getCustomerName());
	}

}
