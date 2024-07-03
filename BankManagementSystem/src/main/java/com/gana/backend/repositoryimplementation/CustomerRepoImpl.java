package com.gana.backend.repositoryimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gana.backend.model.Customer;
import com.gana.backend.repository.CustomerRepo;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class CustomerRepoImpl implements CustomerRepo{
		
		@Autowired
		EntityManager entityManager;

		 @Override
		    public void save(Customer customer) {
		        entityManager.persist(customer);
		    }
		 
		    @Override
		    public Customer findById(int customerid) {
		        return entityManager.find(Customer.class, customerid);
		    }
		 
		    @Override
		    public List<Customer> findAll() {
		        return entityManager.createQuery("from Customer", Customer.class).getResultList();
		    }
		 
		    @Override
		    public void update(Customer customer) {
		        entityManager.merge(customer);
		    }
		 
		    @Override
		    public void deleteById(int customerid) {
		    	Customer customer = entityManager.find(Customer.class, customerid);
		        if (customer != null) {
		            entityManager.remove(customer);
		        }
		    }
	


}
