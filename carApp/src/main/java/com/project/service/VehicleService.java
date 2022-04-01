package com.project.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.domain.Vehicle;
import com.project.repository.VehicleRepository;

@Service
public class VehicleService {
	List<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	@Autowired
	VehicleRepository vehicleRepository;
	
	public void addVehicle(Vehicle vehicle) {
		if (vehicle.getMiles() >= 1000) {
			vehicle.setUsed(true);
		} else {
			vehicle.setUsed(false);
		}
		
			vehicleRepository.save(vehicle);
		
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public Vehicle getVehicle(int id) {
		for (int i = 0; i < vehicles.size(); i++) {
			if (id == vehicles.get(i).getId()) {
				return vehicles.get(i);
			}
		}
		return null;

	}
	
	public Vehicle findById(int id) {
		Vehicle show = new Vehicle();
		for(Vehicle temp : vehicles) {
			int showItem = temp.getId();
			if(id == showItem) {
				show = temp;
				return show;
			}
		}
		return null;
	}

	public List<Vehicle> usedVehicles() {
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getIsUsed() == true) {
				System.out.println(vehicle);
				return vehicles;

			}
		}
		return null;

	}

	public List<Vehicle> newVehicles() {
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getIsUsed() == false) {
				System.out.println(vehicle);
				return vehicles;
			}
		}
		return null;

	}

	public double discount(Vehicle vehicle) {
		double originalPrice = vehicle.getPrice();
		double discount = vehicle.getPrice();
		if (vehicle.getAgeOnLot() >= 120) {
			double setDiscount = 0;
			discount = discount * .10;
			setDiscount = originalPrice - discount;
			BigDecimal rounding = new BigDecimal(setDiscount).setScale(2, RoundingMode.HALF_UP);
			setDiscount = rounding.doubleValue();
			vehicle.setPrice(setDiscount);
			System.out.println(setDiscount);
			return setDiscount;
		}
		return originalPrice;

	}

}
