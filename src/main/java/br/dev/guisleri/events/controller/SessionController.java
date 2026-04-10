package br.dev.guisleri.events.controller;

import br.dev.guisleri.events.model.Session;
import br.dev.guisleri.events.service.SessionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SessionController {

    private SessionService sessionService;

    public SessionController(SessionService sessionService) {
        this.sessionService = sessionService;
    }

    @PostMapping("/sessions")
    public ResponseEntity<Session> addSession(@RequestBody Session session) {
        return ResponseEntity.status(201).body(sessionService.addSession(session));
    }

    @GetMapping("/sessions")
    public ResponseEntity<List<Session>> getAllSessions() {
        return ResponseEntity.ok(sessionService.getAllSessions());
    }

    @GetMapping("/sessions/{id}")
    public ResponseEntity<Session> getSessionById(@PathVariable Integer id) {
        return ResponseEntity.ok(sessionService.getSessionById(id));
    }

}
