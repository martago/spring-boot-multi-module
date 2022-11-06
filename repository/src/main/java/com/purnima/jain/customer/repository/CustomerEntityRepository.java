package com.purnima.jain.customer.repository;

import com.purnima.jain.customer.repository.model.CustomerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerEntityRepository extends CrudRepository<CustomerEntity, Long> {
    CustomerEntity getCustomerEntityByCustomerId(Long customerId);
}