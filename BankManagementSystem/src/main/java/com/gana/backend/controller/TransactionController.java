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

import com.gana.backend.model.Transaction;
import com.gana.backend.serviceimpl.TransactionServiceImpl;

@RestController
@RequestMapping("/transaction")
@CrossOrigin("http://localhost:3000")

public class TransactionController {
	
		@Autowired
		TransactionServiceImpl service;
		@PostMapping
	public String insertTransaction(@RequestBody Transaction transaction ) {
			
			String msg = "";
			try {
				service.addTransaction(transaction);
				msg =  "Success";
			}
			catch(Exception e) {
				
				msg = "Failure";
				
			}
			return msg;
		}
		
		@GetMapping("{transactionid}")
		public Transaction getTransactionById(@PathVariable("transactionid") int transactionid) {
		return service.getTransaction(transactionid);
		}
		
		@GetMapping("/all")
		public List<Transaction> getTransactions() {
		return service.getAllTransactions();
		}
		
		@PutMapping
		public String updateTransaction(@RequestBody Transaction transaction ) {
			
			String msg = "";
			try {
				service.updateTransaction(transaction);
				msg =  "Good";
			}
			catch(Exception e) {
				
				msg = "Bad";
				
			}
			return msg;
		}
		
		@DeleteMapping("{transactionid}")
		public String deleteTransactionById(@PathVariable("transactionid") int transactionid) {
			String msg = "";
			try {
				service.deleteTransaction(transactionid);
				msg =  "Fair";
			}
			catch(Exception e) {
				
				msg = "Not";
				
			}
			return msg;
		}

	


}
