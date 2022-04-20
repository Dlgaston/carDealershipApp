package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.project.domain.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	@Query("SELECT S FROM Customer S WHERE S.email = ?1 and S.password = ?2")
	public Customer logIn(String email, String password);
	

	@Query("SELECT S FROM Customer S WHERE S.isAdmin = 1")
	public Customer findByAdmin(Customer customer);
}
