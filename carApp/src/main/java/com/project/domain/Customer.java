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
	Integer id;
	@Column(name="first_name")
	String fName;
	@Column(name="last_name")
	String lName;
	@Column(name="email")
	String email;
	@Column(name="password")
	String password;
	@Column(name = "is_admin")
	boolean isAdmin;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="customer_id")
	List<Vehicle> vehicle;
	

	public Customer(){}
	

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
	
	

	public boolean getisAdmin() {
		return isAdmin;
	}


	public void setAdmin(boolean isAdmin) {
		isAdmin = false;
		this.isAdmin = isAdmin;
	}


	public List<Vehicle> getVehicle() {
		return vehicle;
	}


	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", password="
				+ password + ", isAdmin=" + isAdmin + ", vehicle=" + vehicle + "]";
	}
	
	
}
