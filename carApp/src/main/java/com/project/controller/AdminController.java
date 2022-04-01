package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.domain.Admin;
import com.project.service.AdminService;
import com.project.service.CustomerService;
import com.project.domain.Customer;
import com.project.repository.CustomerRepository;

@Controller
public class AdminController {
	@Autowired
	AdminService adminService;
	@Autowired
	CustomerService customerService;
	@Autowired
	CustomerRepository customerRepository;

	@GetMapping("/login")
	public ModelAndView login(Model model) {
		return new ModelAndView("login", "admin", new Admin());
	}
	@PostMapping("/login")
	public String handleLogin(Model model, @ModelAttribute("admin") Admin admin, HttpSession session) {
		admin = adminService.isAdmin(admin);
		List<Customer> customer = customerRepository.findAll();
		if(admin != null) {
			model.addAttribute("list", customer);
			return "admin-page";
		} else {
			return "index";
		}
	}
}
