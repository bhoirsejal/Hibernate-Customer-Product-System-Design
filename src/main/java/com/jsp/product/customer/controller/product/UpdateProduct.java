package com.jsp.product.customer.controller.product;

import com.jsp.product.customer.dto.Product;
import com.jsp.product.customer.service.ProductService;

public class UpdateProduct {

	public static void main(String[] args) {
		Product product=new Product();
		product.setName("Washing machine");
		product.setPrice(30000);
		
		ProductService productService=new ProductService();
		Product product2= productService.updateProduct(product, 6);
		
		if(product2 != null) {
			System.out.println("Product Record updated");
		}

	}

}
