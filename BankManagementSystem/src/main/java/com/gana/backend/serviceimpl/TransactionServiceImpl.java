package com.gana.backend.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gana.backend.model.Transaction;
import com.gana.backend.repository.TransactionRepo;

import com.gana.backend.service.TransactionService;
@Service
public class TransactionServiceImpl implements TransactionService{
		
		@Autowired
		TransactionRepo repo;

		@Override
		public void addTransaction(Transaction transaction) {
			
			repo.save(transaction);
			

		}
		
		@Override
		public Transaction getTransaction(int transactionid) {
			
			return repo.findById(transactionid);
			

		}

		@Override
		public List<Transaction> getAllTransactions() {
			return repo.findAll();
			
		}

		@Override
		public void updateTransaction(Transaction transaction) {
			repo.save(transaction);
			
		}

		@Override
		public void deleteTransaction(int transactionid) {
			repo.deleteById(transactionid);
			
		}


	


}
