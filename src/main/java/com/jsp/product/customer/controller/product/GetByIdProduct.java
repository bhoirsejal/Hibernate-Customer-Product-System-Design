package com.jsp.product.customer.controller.product;

import com.jsp.product.customer.dto.Product;
import com.jsp.product.customer.service.ProductService;

public class GetByIdProduct {

	public static void main(String[] args) {
		ProductService productService=new ProductService();
		 Product product =productService.getByIdProduct(4);
		 System.out.println(product.getId());
		 System.out.println(product.getName());
		 System.out.println(product.getPrice());
	}

}
