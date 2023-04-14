package com.jsp.product.customer.controller.product;

import com.jsp.product.customer.dto.Product;
import com.jsp.product.customer.service.ProductService;

public class DeleteProduct {

	public static void main(String[] args) {
		ProductService productService=new ProductService();
		Product product= productService.deleteProduct(3);
		if (product != null) {
			System.out.println("Product Record has been deleted");
		}

	}

}
