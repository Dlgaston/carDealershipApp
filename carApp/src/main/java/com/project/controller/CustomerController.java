package com.project.controller;

import java.util.ArrayList;
import java.util.List;

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

		customerRepository.save(customer);
		return "index";
	}

	@GetMapping("/login")
	public ModelAndView login(Model model) {
		return new ModelAndView("login", "customer", new Customer());
	}

	@PostMapping("/login")
	public String handleLogin(Model model, @ModelAttribute("customer") Customer user, HttpSession session) {
		user = customerService.logIn(user.getEmail(), user.getPassword());
		if(user == null) {
			return "login";
		}
		
		else if (user.getisAdmin()== true) {
			List<Customer> customers = customerRepository.findAll();
			model.addAttribute("list", customers);
			return "admin-page";
		} else  {
			
				model.addAttribute("user", user);
				List<Vehicle> vehicleList = vehicleRepository.findAll();
				model.addAttribute("vehicleList", vehicleList);
			return "auto-list";
		
		}
	
		

	}

	@GetMapping("/buy-vehicle")
	public String addCustomer(Model model, @RequestParam Integer id, HttpSession session) {
		Vehicle vehicle = vehicleRepository.getById(id);
		model.addAttribute("vehicle", vehicle);
		model.addAttribute("customer", new Customer());
		System.out.println(vehicle);
		return "buy-vehicle";
	}

	@PostMapping("/buy-vehicle")
	public String handleBuyVehicle(Model model, @ModelAttribute("customer") Customer customer,
			@ModelAttribute("vehicle") Vehicle vehicle, HttpSession session) {

		return "index";

	}
}