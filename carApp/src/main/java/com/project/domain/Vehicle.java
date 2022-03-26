package com.project.domain;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import org.springframework.format.annotation.DateTimeFormat;


public class Vehicle {
	private String id;
	String manufacturer;
	String make;
	String model;
	Date yearOfMake;
	double price;
	double miles;
	boolean isUsed = false;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	LocalDate purchaseDate;
	Integer ageOnLot;
	String description;
	String url;

	public Vehicle(){
		
	}
	public Vehicle(double miles) {
		if(this.miles >= 1000) {
			this.isUsed = true;
		}else {
			this.isUsed = false;
		}
		
	}
	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Date getYearOfMake() {
		return yearOfMake;
	}

	public void setYearOfMake(Date yearOfMake) {
		this.yearOfMake = yearOfMake;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getIsUsed() {
		return isUsed;
	}
	public void setUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}
	public double getMiles() {
		return miles;
	}

	public void setMiles(double miles) {
		this.miles = miles;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Integer getAgeOnLot() {
		return (int) ChronoUnit.DAYS.between(purchaseDate, LocalDate.now());
	}
	public void setAgeOnLot(Integer ageOnLot) {
		this.ageOnLot = ageOnLot;
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", manufacturer=" + manufacturer + ", make=" + make + ", model=" + model
				+ ", yearOfMake=" + yearOfMake + ", price=" + price + ", miles=" + miles + ", isUsed=" + isUsed
				+ ", purchaseDate=" + purchaseDate + ", ageOnLot=" + ageOnLot + ", description=" + description;
	}
	
	
}
