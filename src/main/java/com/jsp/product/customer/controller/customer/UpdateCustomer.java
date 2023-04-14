package com.jsp.product.customer.controller.customer;

import com.jsp.product.customer.dto.Customer;
import com.jsp.product.customer.service.CustomerService;

public class UpdateCustomer {
	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setName("advaith");
		customer.setAge(23);
		
		CustomerService customerService=new CustomerService();
		Customer customer2= customerService.updateCustomer(customer, 4);
		
		if(customer2 != null) {
			System.out.println("Customer Record updated");
		}
		
	}

}
