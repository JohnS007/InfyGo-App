package com.infy.irs.flightbookingservice.repository;

import com.infy.irs.flightbookingservice.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
