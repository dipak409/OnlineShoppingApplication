package com.cg.onlineshoppingapplication.service;

import java.util.List;

import com.cg.onlineshoppingapplication.entities.Customer;

public interface CustomerService {
	Customer addCustomer(Customer customer);
	Customer updateCustomer(Customer customer);
	Customer removeCustomer(Customer customer);
	Customer viewCustomer(Customer customer);
	List<Customer> viewAllcustomer(String location);
}
