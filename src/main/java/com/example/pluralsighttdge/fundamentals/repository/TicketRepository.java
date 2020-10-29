package com.example.pluralsighttdge.fundamentals.repository;

import com.example.pluralsighttdge.fundamentals.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
