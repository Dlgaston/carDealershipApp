package com.project.controller;

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
import org.springframework.format.annotation.DateTimeFormat;

import com.project.domain.Customer;
import com.project.domain.Vehicle;
import com.project.service.VehicleService;

@Controller
public class VehicleController {
	
	@Autowired
	VehicleService vehicleService;

	@GetMapping("/")
	public String welcome(Model model) {
		return "index";
		
	}
	
	@GetMapping("/add-inventory")
	public ModelAndView addInventory(Model model) {
		return new ModelAndView("add-inventory", "vehicle", new Vehicle());
	}
	
	@PostMapping("/add-inventory")
	public String handleAddInventory(Model model, @ModelAttribute("vehicle") Vehicle vehicle, HttpSession session) {
		vehicleService.addVehicle(vehicle);
		System.out.println(vehicle);
		return "index";
}
	@GetMapping("/auto-list")
	public String printList(Model model, Vehicle vehicle){
		List<Vehicle> vehicleList = vehicleService.getVehicles();
		model.addAttribute("vehicleList", vehicleList);
		return "auto-list";
		
	}
	@GetMapping("/vehicle-page")
	public String vehiclePage(Model model, @RequestParam String id, HttpSession session) {
		Vehicle vehicle = vehicleService.getVehicle(id);
		if(vehicle == null) {
			System.out.println("No vehicle");
			return "index";
		}
			model.addAttribute("vehiclelisting", vehicle);
			model.addAttribute("discount",vehicleService.discount(vehicle));
			
		return "vehicle-page";
		
	}
	@GetMapping("/buy-vehicle")
	public ModelAndView addInventory(Model model, @RequestParam String id, HttpSession session) {
		Vehicle vehicle = vehicleService.getVehicle(id);
		return new ModelAndView("buy-vehicle", "customer", new Customer());
	}

}
