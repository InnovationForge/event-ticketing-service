package com.github.innovationforge.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/events")
@RequiredArgsConstructor
@Slf4j
public class EventController {
    @GetMapping
    public ResponseEntity<?> RetrieveListOfAllEvents() {
        return ResponseEntity.ok().body("Retrieves a list of all events successfully");
    }

    @PostMapping
    public ResponseEntity<?> createsANewEvent() {
        return ResponseEntity.ok().body(" Creates a new event successfully");
    }
    @GetMapping("/{eventId}")
    public ResponseEntity<?> RetrieveEventByEventId(@PathVariable String eventId) {
        log.info("event id : "+eventId);
        return ResponseEntity.ok().body("Retrieves a specific event by its ID successfully");
    }

    @PutMapping("/{eventId}")
    public ResponseEntity<?> updatesEventByEventId(@PathVariable String eventId) {
        log.info("event id : "+eventId);
        return ResponseEntity.ok().body("Updates an existing event by event ID successfully");
    }

    @DeleteMapping("/{eventId}")
    public ResponseEntity<?> deleteEventByEventId(@PathVariable String eventId) {
        log.info("event id : "+eventId);
        return ResponseEntity.ok().body("Deletes an event by event ID successfully");
    }
}
