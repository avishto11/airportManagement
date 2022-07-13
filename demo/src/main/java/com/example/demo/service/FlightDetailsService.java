package com.example.demo.service;

import java.util.List;

import com.example.demo.model.FlightBooked;
import com.example.demo.model.FlightDetails;

public interface FlightDetailsService {
	
	String saveFlight(FlightDetails flight);

	List<FlightDetails> GetFlightDetails();
	
	String deleteFlightDetail(int id);

	List<FlightDetails> flightSeach(String toname,String fromname);
	
	String FlightBooked(FlightBooked flightBooked);
	
	List<FlightDetails> getFlightBookedUser(String username);
}
