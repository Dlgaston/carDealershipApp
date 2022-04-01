package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.domain.Admin;
import com.project.domain.Customer;

@Service
public class AdminService {
	
	@Autowired
	CustomerService customerService;
	
	
	public CustomerService getCustomer() {
		CustomerService customers = customerService;
		return customers;
		
	}
	public Admin isAdmin(Admin admin) {
		if(admin.getEmail().equals("123@gmail.com") && admin.getPassword().equals("123")){
			return admin;
		} else {
			return null;
	}
	
}

}
