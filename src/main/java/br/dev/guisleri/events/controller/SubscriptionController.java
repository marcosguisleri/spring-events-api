package br.dev.guisleri.events.controller;

import br.dev.guisleri.events.model.Session;
import br.dev.guisleri.events.model.Subscription;
import br.dev.guisleri.events.model.User;
import br.dev.guisleri.events.service.SubscriptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubscriptionController {

    private SubscriptionService subscriptionService;

    public SubscriptionController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @PostMapping("/subscriptions")
    public ResponseEntity<Subscription> addSubscription(@RequestBody Subscription subscription) {
        return ResponseEntity.status(201).body(subscriptionService.addSubscription(subscription));
    }

    @GetMapping("/subscriptions/user/{userId}")
    public ResponseEntity<List<Subscription>> getUserById(@PathVariable(name = "userId") Integer id) {
        User user = new User();
        user.setUserId(id);
        return ResponseEntity.ok(subscriptionService.getAllByUser(user));
    }

    @GetMapping("/subscriptions/sessions/{sessionId}")
    public ResponseEntity<List<Subscription>> getSessionById(@PathVariable(name = "sessionId") Integer id) {
        Session session = new Session();
        session.setSessionId(id);
        return ResponseEntity.ok(subscriptionService.getAllBySession(session));
    }
    
    @GetMapping("/subscriptions")
    public ResponseEntity<List<Subscription>> getAllSubscriptions() {
        return ResponseEntity.ok(subscriptionService.getAllSubscriptions());
    }

}
