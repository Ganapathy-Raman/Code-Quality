package com.gana.backend.repository;

import java.util.List;

import com.gana.backend.model.Transaction;


public interface TransactionRepo {

		public void save(Transaction transaction);

		public Transaction findById(int transactionid) ;

		public List<Transaction> findAll();


		public void update(Transaction transaction);

		public void deleteById(int id);

	


}
