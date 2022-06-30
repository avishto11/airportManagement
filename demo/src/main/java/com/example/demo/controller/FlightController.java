package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FlightDetails;
import com.example.demo.service.FlightDetailsService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class FlightController {

	@Autowired
	private FlightDetailsService flightDetailsService;
	
	@PostMapping("/enterFlight")
	public String entterUsers(@RequestBody FlightDetails flight) {
		return  flightDetailsService.saveFlight(flight);
	}
	
}
