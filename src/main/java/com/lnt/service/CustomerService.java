package com.lnt.service;

import java.util.List;

import com.lnt.entity.Customer;
import com.lnt.entity.Product;

public interface CustomerService {
	 String addOrUpdateCustomer(Customer customer);
	 List<Customer> viewAllCustomers();
	 Customer findCustomerById(int customerId);
	 Customer loginCustomer(String email, String password);
	 Customer removeCustomer(int customerId);

}
