package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.FlightDetails;

public interface FlightDetailsRepo  extends JpaRepository<FlightDetails, Integer>{
	
	
	public void deleteByFlightname(String flightname);
	
	@Query(value="select * from flight where toname=?1 and fromname=?2",nativeQuery = true)
	List<FlightDetails> searchFlight(String toname,String fromname);
	
	@Query(value="SELECT f.id,flightname,f.toname,f.fromname,f.timedep,f.timearrive,f.flightday from flight f join flightbook b on f.id= b.flight_id where b.username = ?1",nativeQuery = true)
	List<FlightDetails> getUserFlightDetails(String username);

}
