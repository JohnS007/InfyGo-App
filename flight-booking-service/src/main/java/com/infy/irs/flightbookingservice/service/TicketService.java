package com.infy.irs.flightbookingservice.service;

import com.infy.irs.flightbookingservice.entity.Ticket;
import com.infy.irs.flightbookingservice.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

	@Autowired
	private TicketRepository ticketRepository;

	public void createTicket(Ticket ticket) {

		ticketRepository.saveAndFlush(ticket);

	}

}
