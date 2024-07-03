package com.gana.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gana.backend.model.Customer;
import com.gana.backend.serviceimpl.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
@CrossOrigin("http://localhost:3000")
public class CustomerController {
		
		@Autowired
		CustomerServiceImpl service;
		@PostMapping
		public String insertCustomer(@RequestBody Customer customer ) {
			
			String msg = "";
			try {
				service.addCustomer(customer);
				msg =  "Success";
			}
			catch(Exception e) {
				
				msg = "Failure";
				
			}
			return msg;
		}
		
		@GetMapping("{customerid}")
		public Customer getCustomerById(@PathVariable("customerid") int customerid) {
		return service.getCustomer(customerid);
		}
		
		
		@GetMapping("/all")
		public List<Customer> getCustomers() {
		return service.getAllCustomers();
		}
		
		@PutMapping
	public String updateCustomer(@RequestBody Customer customer ) {
			
			String msg = "";
			try {
				service.updateCustomer(customer);
				msg =  "Good";
			}
			catch(Exception e) {
				
				msg = "Bad";
				
			}
			return msg;
		}
		
		
		
		@DeleteMapping("{customerid}")
		public String deleteCustomerById(@PathVariable("customerid") int customerid) {
			String msg = "";
			try {
				service.deleteCustomer(customerid);
				msg =  "Fair";
			}
			catch(Exception e) {
				
				msg = "Not";
				
			}
			return msg;
		}


	


}
