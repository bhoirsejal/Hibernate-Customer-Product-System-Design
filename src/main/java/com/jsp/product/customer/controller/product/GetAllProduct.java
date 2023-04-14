package com.jsp.product.customer.controller.product;

import com.jsp.product.customer.service.ProductService;

public class GetAllProduct {

	public static void main(String[] args) {
		ProductService productService=new ProductService();
		productService.getAll();

	}

}
