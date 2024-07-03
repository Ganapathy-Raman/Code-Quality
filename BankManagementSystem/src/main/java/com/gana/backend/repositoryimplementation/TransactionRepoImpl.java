package com.gana.backend.repositoryimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gana.backend.model.Transaction;
import com.gana.backend.repository.TransactionRepo;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TransactionRepoImpl implements TransactionRepo{

		@Autowired
		EntityManager entityManager;
		
		@Override
	    public void save(Transaction transaction) {
	        entityManager.merge(transaction);
	    }
	 
	    @Override
	    public Transaction findById(int transactionid) {
	        return entityManager.find(Transaction.class, transactionid);
	    }
	 
	    @Override
	    public List<Transaction> findAll() {
	        return entityManager.createQuery("from Transaction", Transaction.class).getResultList();
	    }
	 
	    @Override
	    public void update(Transaction transaction) {
	        entityManager.merge(transaction);
	    }
	 
	    @Override
	    public void deleteById(int transactionid) {
	    	Transaction transaction = entityManager.find(Transaction.class, transactionid);
	        if (transaction != null) {
	            entityManager.remove(transaction);
	        }
	    }

	


}
