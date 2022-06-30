package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FlightDetails;
import com.example.demo.repo.FlightDetailsRepo;
import com.example.demo.service.FlightDetailsService;

@Service
public class FlightDetailsserviceImpl implements FlightDetailsService  {

	@Autowired
	FlightDetailsRepo flightDetailsRepo;
	
	@Override
	public String saveFlight(FlightDetails flight) {
		// TODO Auto-generated method stub
		 flightDetailsRepo.save(flight);
		 return "successfully added Flight";
	}

}
