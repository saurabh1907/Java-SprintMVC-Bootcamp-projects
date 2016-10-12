package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
		System.out.println("inside CustomerServiceImpl()");
		System.out.println("customerRepository ref: "+customerRepository);
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("customerRepository property is now available via constructor");
		this.customerRepository = customerRepository;
		System.out.println("customerRepository ref: "+customerRepository);
	}
	
	public void setCustomerRepository(CustomerRepository customerRepositoryRef) {
		System.out.println("1.customerRepository property is now available");
		this.customerRepository = customerRepositoryRef;
	}

	public void setCustomerRepository2(CustomerRepository customerRepositoryRef) {
		System.out.println("2.customerRepository property is now available");
		this.customerRepository = customerRepositoryRef;
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
