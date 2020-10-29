package com.example.pluralsighttdge.fundamentals.web;

import com.example.pluralsighttdge.fundamentals.entity.Application;
import com.example.pluralsighttdge.fundamentals.entity.Ticket;
import com.example.pluralsighttdge.fundamentals.exception.ApplicationNotFoundException;
import com.example.pluralsighttdge.fundamentals.exception.TicketNotFoundException;
import com.example.pluralsighttdge.fundamentals.service.ApplicationService;
import com.example.pluralsighttdge.fundamentals.service.TicketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("tza")

public class TzaController {
    private ApplicationService applicationService;
    private TicketService ticketService;

    private final Logger logger = LoggerFactory.getLogger(TzaController.class);

    @Autowired
    public void setApplicationService(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @Autowired
    public void setTicketService(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/tickets")
    public ResponseEntity<List<Ticket>> getAllTickets(){
        List<Ticket> list = ticketService.listTickets();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/applications")
    public ResponseEntity<List<Application>> getAllApplication(){
        List<Application> list = applicationService.listApplications();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/application/{id}")
    public ResponseEntity<Application> getApplication(@PathVariable("id") long id){
        logger.info("I was called");
        try{

            return new ResponseEntity<>(applicationService.findApplication(id), HttpStatus.OK);
        } catch (ApplicationNotFoundException exception){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Application Not Found");
        }
    }

    @GetMapping("/ticket/{id}")
    public ResponseEntity<Ticket> getTicket(@PathVariable("id") long id){
        try{
            return new ResponseEntity<>(ticketService.findTicket(id), HttpStatus.OK);
        } catch (TicketNotFoundException exception){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Tcket Not Found");
        }
    }
}
