package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.FlightBooked;

public interface FlightBookRepo extends JpaRepository<FlightBooked, Integer> {

}
