package com.cg.service;

import java.util.List;

import com.cg.model.Customer;
import com.cg.repository.CustomerRepository;
import com.cg.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	{
		customerRepository= new HibernateCustomerRepositoryImpl();
	}
	
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
