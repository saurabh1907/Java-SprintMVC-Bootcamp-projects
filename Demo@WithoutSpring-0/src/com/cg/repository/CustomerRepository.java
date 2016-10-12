package com.cg.repository;

import java.util.List;

import com.cg.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}