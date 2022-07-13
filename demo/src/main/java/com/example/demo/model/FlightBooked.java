package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flightbook")
public class FlightBooked {

	@Id
	int id;
	int flightId;
	String username;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "FlightBooked [id=" + id + ", flightId=" + flightId + ", username=" + username + "]";
	}
	public FlightBooked(int id, int flightId, String username) {
		super();
		this.id = id;
		this.flightId = flightId;
		this.username = username;
	}
	public FlightBooked() {
		super();
	}
	
	
}
