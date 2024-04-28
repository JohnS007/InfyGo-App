package com.infy.irs.flightbookingservice.dto;

import com.infy.irs.flightbookingservice.entity.Passenger;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public class PassengerDetails {
	@NotEmpty(message = "Passenger List cannot be empty for booking!")
	List<Passenger> passengerList;

	public List<Passenger> getPassengerList() {
		return passengerList;
	}

	public PassengerDetails() {
		super();
	}

	public PassengerDetails(List<Passenger> passengerList) {
		super();
		this.passengerList = passengerList;
	}

	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}

	@Override
	public String toString() {
		return "PassengerDetails [passengerList=" + passengerList + "]";
	}

}
