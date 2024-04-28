package com.infy.irs.flightbookingservice.repository;

import com.infy.irs.flightbookingservice.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Double> {

}
