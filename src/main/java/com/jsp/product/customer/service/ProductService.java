package com.jsp.product.customer.service;

import com.jsp.product.customer.dao.ProductDao;
import com.jsp.product.customer.dto.Product;

public class ProductService {
	ProductDao productDao=new ProductDao();
	
	public Product saveProduct(Product product) {
		return productDao.saveProduct(product);
	}
	
	public Product getByIdProduct(int id) {
		return productDao.getByIdProduct(id);
	}
	public Product deleteProduct(int id) {
		Product product= productDao.getByIdProduct(id);
		if(product != null) {
		 return productDao.deleteProduct(product);
		}
		return null;
	}
	public Product updateProduct(Product product,int id) {
		Product product2= productDao.getByIdProduct(id);
		if(product.getName() != null) {
			product2.setName(product.getName());
			
		}
		if(product.getPrice()!=0) {
			product2.setPrice(product.getPrice());
		}
		if(product2 != null) {
		 return productDao.updateProduct(product2);
		}
		return null;
		
	}
	public void getAll() {
		productDao.getAll();
	}
	

}
