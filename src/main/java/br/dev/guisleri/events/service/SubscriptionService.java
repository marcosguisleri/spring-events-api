package br.dev.guisleri.events.service;

import br.dev.guisleri.events.model.Session;
import br.dev.guisleri.events.model.Subscription;
import br.dev.guisleri.events.model.User;
import br.dev.guisleri.events.repo.SubscriptionRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class SubscriptionService implements ISubscriptionService {

    private SubscriptionRepo subscriptionRepo;

    public SubscriptionService(SubscriptionRepo subscriptionRepo) {
        this.subscriptionRepo = subscriptionRepo;
    }

    @Override
    public Subscription addSubscription(Subscription subscription) {
        subscription.setCreatedAt(LocalDateTime.now());
        subscription.setUniqueID(UUID.randomUUID().toString());
        return subscriptionRepo.save(subscription);
    }

    @Override
    public List<Subscription> getAllByUser(User user) {
        return subscriptionRepo.findByIdUser(user);
    }

    @Override
    public List<Subscription> getAllBySession(Session session) {
        return subscriptionRepo.findByIdSession(session);
    }

    @Override
    public List<Subscription> getAllSubscriptions() {
        return subscriptionRepo.findAll();
    }

}
