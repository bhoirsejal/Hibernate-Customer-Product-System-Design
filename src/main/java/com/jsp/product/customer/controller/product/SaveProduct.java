package com.jsp.product.customer.controller.product;

import com.jsp.product.customer.dto.Product;
import com.jsp.product.customer.service.ProductService;

public class SaveProduct {

	public static void main(String[] args) {
		Product product=new Product();
		product.setName("Laptop");
		product.setPrice(50000);
		
		ProductService productService=new ProductService();
		Product product2= productService.saveProduct(product);
		if(product2 != null) {
			System.out.println("Product is added");
		}
	}

}
