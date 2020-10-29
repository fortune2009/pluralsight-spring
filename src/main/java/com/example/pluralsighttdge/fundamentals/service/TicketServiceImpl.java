package com.example.pluralsighttdge.fundamentals.service;

import com.example.pluralsighttdge.fundamentals.entity.Ticket;
import com.example.pluralsighttdge.fundamentals.exception.TicketNotFoundException;
import com.example.pluralsighttdge.fundamentals.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> listTickets() {
        return (List<Ticket>) ticketRepository.findAll();
    }

    @Override
    public Ticket findTicket(long id) {
        Optional<Ticket> optionalTicket = ticketRepository.findById(id);

        if(optionalTicket.isPresent()){
            return optionalTicket.get();
        } else{
            throw new TicketNotFoundException("Ticket Not Found");
        }
    }
}
