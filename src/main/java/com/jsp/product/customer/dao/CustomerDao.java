package com.jsp.product.customer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.product.customer.dto.Customer;

public class CustomerDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sejal");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Customer saveCustomer(Customer customer) {
		if (customer != null) {
			entityTransaction.begin();
			entityManager.persist(customer);
			entityTransaction.commit();
			return customer;
		}
		return null;
	}
	
	public Customer getByIdCustomer(int id) {
		 return entityManager.find(Customer.class, id);
		
	}
	public Customer deleteCustomer(Customer customer) {
		if(customer != null) {
			entityTransaction.begin();
			entityManager.remove(customer);
			entityTransaction.commit();
			return customer;
		}
		return null;
	}
	public Customer updateCustomer(Customer customer) {
		if(customer != null) {
			entityTransaction.begin();
			entityManager.merge(customer);
			entityTransaction.commit();
			return customer;
			
		}
		return null;
	}
	public void getAll() {
		String sql="select c from Customer c";
		Query query= entityManager.createQuery(sql);
		List<Customer> customers= query.getResultList();
		for (Customer customer : customers) {
			System.out.println(customer.getId());
			System.out.println(customer.getName());
			System.out.println(customer.getAge());
			System.out.println("=======================");
		}
	}
}
