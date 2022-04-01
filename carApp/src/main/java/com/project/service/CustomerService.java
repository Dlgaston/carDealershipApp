package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.domain.Admin;
import com.project.domain.Customer;
import com.project.domain.Vehicle;

@Service
public class CustomerService {
	List<Customer> customers = new ArrayList<Customer>();
	

	public void addCustomer(Customer customer) {
		
			customers.add(customer);
	}
	public double getReceipt(Customer customer) {
		double receipt=0;
		customer.getAmountSpent();
		receipt = customer.getAmountSpent();
		
		return receipt;
	}
	public List<Customer> getCustomers(){
		return customers;
}
	public Customer isAdmin(Customer customer) {
		if(customer.getEmail().equals("123@gmail.com") && customer.getPassword().equals("123")){
			return customer;
		} else {
			return null;
	}
	
}
}
