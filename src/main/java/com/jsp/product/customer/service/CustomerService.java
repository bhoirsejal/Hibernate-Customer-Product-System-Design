package com.jsp.product.customer.service;

import com.jsp.product.customer.dao.CustomerDao;
import com.jsp.product.customer.dto.Customer;

public class CustomerService {
	CustomerDao customerDao = new CustomerDao();

	public Customer saveCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);
	}

	public Customer getByIdCustomer(int id) {
		return customerDao.getByIdCustomer(id);
	}

	public Customer deleteCustomer(int id) {
		Customer customer = customerDao.getByIdCustomer(id);
		if (customer != null) {
			return customerDao.deleteCustomer(customer);
		}
		return null;
	}

	public Customer updateCustomer(Customer customer, int id) {
		Customer customer2 = customerDao.getByIdCustomer(id);
		if (customer.getName() != null) {
			customer2.setName(customer.getName());
		}
		if (customer.getAge() != 0) {
			customer2.setAge(customer.getAge());
		}
		if (customer2 != null) {
			return customerDao.updateCustomer(customer2);
		}
		return null;
	}

	public void getAll() {
		customerDao.getAll();
	}

}
