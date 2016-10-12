package com.cg.repository;

import java.util.ArrayList;
import java.util.List;

import com.cg.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	public List<Customer> findAll() {
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Bryan");
		customer.setLastname("Hansen");
		
		customers.add(customer);
		
		return customers;
		
	}

}
