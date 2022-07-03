package com.example.demo.service;

import java.util.List;

import com.example.demo.model.FlightDetails;

public interface FlightDetailsService {
	
	String saveFlight(FlightDetails flight);

	List<FlightDetails> GetFlightDetails();
	
	String deleteFlightDetail(int id);

}
