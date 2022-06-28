package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AirportAdmin;
import com.example.demo.model.CompanyAdmin;
import com.example.demo.model.User;

public interface AirportAdminRepo extends JpaRepository<AirportAdmin, Long> {
	
	public AirportAdmin getByUsername(String airportAdmin);

}
