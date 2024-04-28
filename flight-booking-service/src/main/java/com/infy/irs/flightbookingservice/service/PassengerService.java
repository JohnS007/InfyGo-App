package com.infy.irs.flightbookingservice.service;

import com.infy.irs.flightbookingservice.entity.Passenger;
import com.infy.irs.flightbookingservice.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

	@Autowired
	private PassengerRepository passengerRepository;

	public void createPassenger(List<Passenger> passengers) {

		passengerRepository.saveAll(passengers);

	}
	
}
