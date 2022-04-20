package com.project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.domain.Customer;
import com.project.domain.Vehicle;
import com.project.repository.CustomerRepository;


@Service
public class CustomerService {
	List<Customer> customers = new ArrayList<Customer>();
	
	@Autowired
	CustomerRepository customerRepository;
	
	

	public void addCustomer(Customer customer) {

		customers.add(customer);
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	
	public Customer logIn(String email, String password) {
		Customer logInCustomer = customerRepository.logIn(email, password);
		if(logInCustomer != null) {
			return logInCustomer;
		} else {
			return null;
		}
	}

	public void buyVehicle(Customer c, Vehicle v) {

	}
}
