package com.gana.backend.repository;

import java.util.List;

import com.gana.backend.model.Customer;


public interface CustomerRepo {

	
		
		public void save(Customer customer);

		public Customer findById(int customerid) ;

		public List<Customer> findAll();


		public void update(Customer customer);

		public void deleteById(int id);
		

	

}
