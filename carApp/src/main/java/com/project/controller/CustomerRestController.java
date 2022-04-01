package com.project.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.domain.Customer;
import com.project.domain.Customer_And_Vehicle;
import com.project.domain.Vehicle;
import com.project.service.CustomerService;
import com.project.service.VehicleService;

@CrossOrigin
@RestController
public class CustomerRestController {
	
//	@Autowired
//	CustomerService customerService;
//	@Autowired
//	VehicleService vehicleService;
//
//	
//	@GetMapping("/create-account")
//	public ModelAndView createAccount(Model model) {
//		return new ModelAndView("create-account", "customer", new Customer());
//	}
//	
//	@PostMapping("/create-account")
//	public String handleSignUp(Model model, @ModelAttribute("customer") Customer customer, HttpSession session) {
//		customerService.addCustomer(customer);
//		return "index";
//	}
//	@GetMapping("/buy-vehicle")
//	public String addCustomer(Model model, @RequestParam String id, HttpSession session) {
//		Vehicle vehicle = vehicleService.getVehicle(id);
//		//Vehicle vehicle = vehicleService.findById(id);
//		
//		model.addAttribute("vehicle", vehicle);
//		model.addAttribute("customer", new Customer());
//		Customer_And_Vehicle cv = new Customer_And_Vehicle();
//		cv.setVehicle(vehicle);
//		cv.setCustomer(new Customer());
//		model.addAttribute("cv", cv);
//		System.out.println(vehicle);
//		return "buy-vehicle";
//	}
//	@PostMapping("/buy-vehicle")
//	public String handleBuyVehicle(Model model, @ModelAttribute("customer") Customer customer, @ModelAttribute("vehicleOne") Vehicle vehicle,
//			@ModelAttribute("cv") Customer_And_Vehicle cv, HttpSession session) {
//		Vehicle vehicleOne = vehicleService.findById("123");
//		vehicleOne.setBought(true);
//		model.getAttribute("customer");
//		model.getAttribute("vehicle");
//        //model.addAttribute("vehicle", vehicleService.getVehicle(vehicle.getId()));
//		model.addAttribute("vehicleOne", vehicleService.findById("123"));
//		//cv.getVehicle().setBought(true);
//		customer.setEmail(cv.getCustomer().getEmail());
//		customer.setfName(cv.getCustomer().getfName());
//		customer.setVehicle(vehicleOne);
//		customer.setAmountSpent(vehicleOne.getPrice());
//		customerService.addCustomer(customer);
//		return "index";
//	
//}
}