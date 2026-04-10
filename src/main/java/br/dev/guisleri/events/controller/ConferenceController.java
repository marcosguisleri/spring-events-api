package br.dev.guisleri.events.controller;

import br.dev.guisleri.events.model.Conference;
import br.dev.guisleri.events.service.ConferenceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ConferenceController {

    private ConferenceService conferenceService;

    public ConferenceController(ConferenceService conferenceService) {
        this.conferenceService = conferenceService;
    }

    @PostMapping("/conferences")
    public ResponseEntity<Conference> addConference(@RequestBody Conference conference) {
        return ResponseEntity.status(201).body(conferenceService.addConference(conference));
    }

    @GetMapping("/conferences")
    public ResponseEntity<List<Conference>> getAllConferences() {
        return ResponseEntity.ok(conferenceService.getAllConferences());
    }

    @GetMapping("/conferences/{id}")
    public ResponseEntity<Conference> getConferenceById(@PathVariable Integer id) {
        return ResponseEntity.ok(conferenceService.getConferenceById(id));
    }

}
