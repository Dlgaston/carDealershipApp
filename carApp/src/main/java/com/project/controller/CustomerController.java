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
import com.project.domain.Customer_And_Vehicle;
import com.project.domain.Vehicle;
import com.project.repository.CustomerRepository;
import com.project.repository.VehicleRepository;
import com.project.service.CustomerService;
import com.project.service.VehicleService;
@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	@Autowired
	VehicleService vehicleService;
	@Autowired
	VehicleRepository vehicleRepository;
	@Autowired
	CustomerRepository customerRepository;

	
	@GetMapping("/create-account")
	public ModelAndView createAccount(Model model) {
		return new ModelAndView("create-account", "customer", new Customer());
	}
	
	@PostMapping("/create-account")
	public String handleSignUp(Model model, @ModelAttribute("customer") Customer customer, HttpSession session) {
		customerService.addCustomer(customer);
		return "index";
	}
	@GetMapping("/buy-vehicle")
	public String addCustomer(Model model, @RequestParam int id, HttpSession session) {
		Vehicle vehicle = vehicleRepository.getById(id);
		model.addAttribute("vehicle", vehicle);
		model.addAttribute("customer", new Customer());
		System.out.println(vehicle);
		return "buy-vehicle";
	}
	@PostMapping("/buy-vehicle")
	public String handleBuyVehicle(Model model,@ModelAttribute("customer") Customer customer,@ModelAttribute("vehicle") Vehicle vehicle,  HttpSession session) {
		Vehicle vehicleOne = vehicleRepository.findByVin(customer.getVin());
		vehicleOne.setBought(true);
		customer.setAmountSpent(vehicleOne.getPrice());
		customerRepository.save(customer);
		vehicleRepository.save(vehicleOne);
		System.out.println(customer);
		return "index";
	
}
}