package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.domain.Customer;

@Service
public class AdminService {
	
	@Autowired
	CustomerService customerService;
	
	
	public CustomerService getCustomer() {
		CustomerService customers = customerService;
		return customers;
		
	}
	
}
