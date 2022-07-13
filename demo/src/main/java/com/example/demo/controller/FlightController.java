package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CompanyAdmin;
import com.example.demo.model.FlightBooked;
import com.example.demo.model.FlightDetails;
import com.example.demo.model.User;
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
	
	@GetMapping("/getFlights")
	public List<FlightDetails> getFlightDetails() {
		
	
			return flightDetailsService.GetFlightDetails();
	
	}
	@DeleteMapping("/deleteFlightDetail/{id}") 
	public String deleteFlightDetail(@PathVariable("id") int id) {
		return flightDetailsService.deleteFlightDetail(id);
	}
	@GetMapping("/searchFlights")
	public List<FlightDetails> searchFlightDetails(@RequestParam("toname") String toname,@RequestParam("fromname") String fromname){
		
		return flightDetailsService.flightSeach(toname, fromname);
				
	}
	
	
	@PostMapping("/saveUserFlight")
	public String saveFlightBooked(@RequestBody FlightBooked flightBooked){
		
		return flightDetailsService.FlightBooked(flightBooked);
	}
	
	
	@GetMapping("/getFlightUser/{username}")
	public List<FlightDetails> getFlightBookedUser(@PathVariable("username")String username){
		return flightDetailsService.getFlightBookedUser(username);
	}
	
}
