package com.project.domain;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="vehicle")
public class Vehicle {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	@Column(name="vin")
	private String vin;
	@Column(name="manufacturer")
	private String manufacturer;
	@Column(name="make")
	private String make;
	@Column(name="model")
	private String model;
	@Column(name="year_of_make")
	private int yearOfMake;
	@Column(name="price")
	private double price;
	@Column(name="miles")
	private double miles;
	@Column(name="is_used")
	private boolean isUsed = false;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="purchase_date")
	private LocalDate purchaseDate;
	@Column(name="age_on_lot")
	private Integer ageOnLot;
	@Column(name="description")
	private String description;
	@Column(name="url")
	private String url;
	@Column(name="is_bought")
	private boolean isBought = false;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customer_id")	
	Customer customer;

	public Vehicle(){
		
	}
	public Vehicle(double miles) {
		if(this.miles >= 1000) {
			this.isUsed = true;
		}else {
			this.isUsed = false;
		}
		
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	


	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
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

	public int getYearOfMake() {
		return yearOfMake;
	}

	public void setYearOfMake(int yearOfMake) {
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
	

	public boolean getIsBought() {
		return isBought;
	}
	public void setBought(boolean isBought) {
		this.isBought = isBought;
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
				+ ", purchaseDate=" + purchaseDate + ", ageOnLot=" + ageOnLot + ", description=" + description
				+ ", isBought=" + isBought + "]";
	}
	
	
}
