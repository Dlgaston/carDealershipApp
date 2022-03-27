package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.domain.Customer;
import com.project.domain.Vehicle;

@Service
public class CustomerService {
	List<Customer> customers = new ArrayList<Customer>();
	

	public void addCustomer(Customer c) {
		
			customers.add(c);
	}
	public double getReceipt(Customer c, Vehicle vehicle) {
		double receipt=0;
		c.setAmountSpent(vehicle.getPrice());
		receipt = c.getAmountSpent();
		
		return receipt;
	}
}
