package com.project.domain;

public class Customer_And_Vehicle {
	Customer customer;
	Vehicle vehicle;

	public Customer_And_Vehicle() {
		
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Customer_And_Vehicle [customer=" + customer + ", vehicle=" + vehicle + "]";
	}
	
}
