package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.domain.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
