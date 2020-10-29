package com.example.pluralsighttdge.fundamentals.service;

import com.example.pluralsighttdge.fundamentals.entity.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> listTickets();

    Ticket findTicket(long id);
}
