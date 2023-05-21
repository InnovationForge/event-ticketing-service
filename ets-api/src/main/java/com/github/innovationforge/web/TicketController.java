package com.github.innovationforge.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/events/{eventId}/tickets")
@RequiredArgsConstructor
@Slf4j
public class TicketController {
    @GetMapping
    public ResponseEntity<?> listTicketsForEvent(@PathVariable String eventId) {
        log.info("event id : "+eventId);
        return ResponseEntity.ok().body("Fetched a list of all tickets available for a specific event based on the provided event ID successfully");
    }
    @PostMapping
    public ResponseEntity<?> createNewTicketForEvent(@PathVariable String eventId) {
        log.info("event id : "+eventId);
        return ResponseEntity.ok().body("Created a new ticket for a specific event successfully");
    }

    @GetMapping("/{ticketId}")
    public ResponseEntity<?> retriveTicketForEventByTicketId(@PathVariable String eventId, @PathVariable String ticketId) {
        log.info("event id : "+eventId);
        log.info("ticket id : "+ticketId);
        return ResponseEntity.ok().body("Retrieved the details of a specific ticket for a specific event based on the provided ticket ID and event ID successfully");
    }

    @PutMapping("/{ticketId}")
    public ResponseEntity<?> updateTicketForEventByTicketId(@PathVariable String eventId, @PathVariable String ticketId) {
        log.info("event id : "+eventId);
        log.info("ticket id : "+ticketId);
        return ResponseEntity.ok().body("Updated ticket data for a specific ticket identified by its ID and event ID successfully");
    }

    @DeleteMapping("/{ticketId}")
    public ResponseEntity<?> removeTicketForEventByTicketId(@PathVariable String eventId, @PathVariable String ticketId) {
        log.info("event id : "+eventId);
        log.info("ticket id : "+ticketId);
        return ResponseEntity.ok().body("Deleted a specific ticket based on the provided ticket ID and event ID successfully");
    }
}
