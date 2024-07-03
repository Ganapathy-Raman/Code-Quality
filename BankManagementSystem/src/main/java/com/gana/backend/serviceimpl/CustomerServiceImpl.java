package com.gana.backend.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gana.backend.model.Customer;
import com.gana.backend.repository.CustomerRepo;
import com.gana.backend.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
		
		@Autowired
		CustomerRepo repo;

		@Override
		public void addCustomer(Customer customer) {
			
			repo.save(customer);
			

		}
		
		@Override
		public Customer getCustomer(int customerid) {
			
			return repo.findById(customerid);
			

		}

		@Override
		public List<Customer> getAllCustomers() {
			return repo.findAll();
			
		}

		@Override
		public void updateCustomer(Customer customer) {
			repo.update(customer);
			
		}
		
		
		@Override
		public void deleteCustomer(int customerid) {
			repo.deleteById(customerid);
		}
		

	


}
