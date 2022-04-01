package com.project.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name="amount_spent")
	double amountSpent;
	@Column(name="fName")
	String fName;
	@Column(name="lName")
	String lName;
	@Column(name="email")
	String email;
	@Column(name="password")
	String password;
	@Transient
	boolean isLoggedIn;
	@Transient
	Vehicle vehicle;
	@OneToMany()
	@JoinColumn(name="vehicle_id")	
	List<Vehicle> vehicles;

	public Customer(){}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}



	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}



	public double getAmountSpent() {
		return amountSpent;
	}
	public void setAmountSpent(double amountSpent) {
		this.amountSpent = amountSpent;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public boolean getIsLoggedIn() {
		return isLoggedIn;
	}

	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}

	@Override
	public String toString() {
		return "Customer [receipt=" + amountSpent + ", fName=" + fName + ", lName=" + lName
				+ ", email=" + email + " vehicle=" + vehicle + " ]";
	}
	
	
}
