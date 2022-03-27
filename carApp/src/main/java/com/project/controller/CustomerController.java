package com.project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

	@GetMapping("/buy-vehicle")
	public ModelAndView addInventory(Model model, @RequestParam String id, HttpSession session) {
		return new ModelAndView("buy-vehicle", "customer", new Customer());
	}
	
}
