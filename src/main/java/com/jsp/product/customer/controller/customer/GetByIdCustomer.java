package com.jsp.product.customer.controller.customer;

import com.jsp.product.customer.dto.Customer;
import com.jsp.product.customer.service.CustomerService;

public class GetByIdCustomer {
	public static void main(String[] args) {
		CustomerService customerService=new CustomerService();
		Customer customer= customerService.getByIdCustomer(3);
		System.out.println(customer.getId());
		System.out.println(customer.getName());
		System.out.println(customer.getAge());
	}

}
