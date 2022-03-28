package com.project.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.domain.Customer;
import com.project.domain.Vehicle;
import com.project.service.CustomerService;
import com.project.service.VehicleService;
@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

	
	@PostMapping("/buy-vehicle")
	public String handleAddInventory(Model model, @ModelAttribute("customer") Customer customer,Vehicle vehicle, HttpSession session) {
		customer.setVehicle(vehicle);
		customerService.addCustomer(customer);
		System.out.println(vehicle);
		return "index";
	
}
}
