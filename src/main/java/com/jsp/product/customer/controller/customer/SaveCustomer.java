package com.jsp.product.customer.controller.customer;


import com.jsp.product.customer.dto.Customer;
import com.jsp.product.customer.service.CustomerService;

public class SaveCustomer {

	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setName("sejal");
		customer.setAge(21);
		
		CustomerService customerService=new CustomerService();
	 	Customer customer2= customerService.saveCustomer(customer);
	 	if (customer2 != null) {
			System.out.println("customer is added");
		}
	}
	

}
