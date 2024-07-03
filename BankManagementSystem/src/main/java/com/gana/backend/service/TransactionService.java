package com.gana.backend.service;

import com.gana.backend.model.Transaction;

import java.util.List;

public interface TransactionService {

		public void addTransaction(Transaction transaction);
		
		public Transaction getTransaction(int transactionid);
		
		public List<Transaction> getAllTransactions();
		
		public void updateTransaction(Transaction transaction);
		
		public void deleteTransaction(int transactionid);


}
