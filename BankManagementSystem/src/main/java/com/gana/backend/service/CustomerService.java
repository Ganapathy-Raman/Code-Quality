package com.gana.backend.service;

import java.util.List;

import com.gana.backend.model.Customer;

public interface CustomerService {
		
		public void addCustomer(Customer customer);
		
		public Customer getCustomer(int customerid);
		
		public List<Customer> getAllCustomers();
		
		public void updateCustomer(Customer customer);
		
		public void deleteCustomer(int customerid);


}
