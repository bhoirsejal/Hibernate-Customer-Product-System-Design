package com.jsp.product.customer.controller.customer;

import com.jsp.product.customer.dto.Customer;
import com.jsp.product.customer.service.CustomerService;

public class DeleteCustomer {

	public static void main(String[] args) {
		
		CustomerService customerService=new CustomerService();
		Customer customer= customerService.deleteCustomer(5);
		if(customer != null) {
			System.out.println("Customer Record Deleted");
		}

	}

}
