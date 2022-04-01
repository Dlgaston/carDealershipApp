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
import com.project.repository.VehicleRepository;
import com.project.service.VehicleService;

@Controller
public class VehicleController {
	
	@Autowired
	VehicleService vehicleService;
	@Autowired
	VehicleRepository vehicleRepository;
	
	
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
		
		try {
		vehicleService.addVehicle(vehicle);
		return "index";
		} catch(Exception e) {
			model.addAttribute("error", e);
			model.addAttribute("vehicle", vehicle);
			return "/add-inventory";
		}
}
	@GetMapping("/auto-list")
	public String printList(Model model, Vehicle vehicle){
		List<Vehicle> vehicleList = vehicleRepository.findAll();
		model.addAttribute("vehicleList", vehicleList);
		return "auto-list";
		
	}
	@GetMapping("/vehicle-page")
	public String vehiclePage(Model model, @RequestParam int id, HttpSession session) {
		Vehicle vehicle = vehicleRepository.findById(id).get();
		if(vehicle == null) {
			System.out.println("No vehicle");
			return "index";
		}
			model.addAttribute("vehiclelisting", vehicle);
			model.addAttribute("discount",vehicleService.discount(vehicle));
			
		return "vehicle-page";
		
	}
	@GetMapping("/error")
	public String error(Model model){
		
		return "error";
		

}
}
