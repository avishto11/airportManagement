package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CompanyAdmin;
import com.example.demo.model.FlightDetails;

public interface FlightDetailsRepo  extends JpaRepository<FlightDetails, Integer>{
	
	
	public void deleteByFlightname(String flightname);

}
