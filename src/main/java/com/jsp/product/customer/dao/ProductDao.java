package com.jsp.product.customer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.product.customer.dto.Product;

public class ProductDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sejal");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Product saveProduct(Product product) {
		if(product != null) {
			entityTransaction.begin();
			entityManager.persist(product);
			entityTransaction.commit();
			return product;
		}
		return null;
	}
	
	public Product getByIdProduct(int id) {
		return entityManager.find(Product.class, id);
	}
	public Product deleteProduct(Product product) {
		if(product != null) {
			entityTransaction.begin();
			entityManager.remove(product);
			entityTransaction.commit();
			return product;
		}
		return null;
	}
	public Product updateProduct(Product product) {
		if(product != null) {
			entityTransaction.begin();
			entityManager.merge(product);
			entityTransaction.commit();
			return product;
			
		}
		return null;
	}
	public void getAll() {
		String sql="select p from Product p";
		Query query= entityManager.createQuery(sql);
		List<Product> products= query.getResultList();
		for (Product product : products) {
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getPrice());
			System.out.println("====================");
			
		}
	}

}
