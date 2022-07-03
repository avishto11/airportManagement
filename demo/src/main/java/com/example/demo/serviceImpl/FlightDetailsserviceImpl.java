package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FlightDetails;
import com.example.demo.repo.FlightDetailsRepo;
import com.example.demo.service.FlightDetailsService;

@Service
public class FlightDetailsserviceImpl implements FlightDetailsService  {

	@Autowired
	private FlightDetailsRepo flightDetailsRepo;
	
	@Override
	public String saveFlight(FlightDetails flight) {
		// TODO Auto-generated method stub
		 flightDetailsRepo.save(flight);
		 return "successfully added Flight";
	}

	@Override
	public List<FlightDetails> GetFlightDetails() {
		// TODO Auto-generated method stub
		return flightDetailsRepo.findAll();
	}

	@Override
	public String deleteFlightDetail(int id) {
		// TODO Auto-generated method stub
		flightDetailsRepo.deleteById(id);
		return "Success";
	}

}
