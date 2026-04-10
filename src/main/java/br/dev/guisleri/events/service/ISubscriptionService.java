package br.dev.guisleri.events.service;

import br.dev.guisleri.events.model.Session;
import br.dev.guisleri.events.model.Subscription;
import br.dev.guisleri.events.model.User;

import java.util.List;

public interface ISubscriptionService {
    public Subscription addSubscription(Subscription subscription);
    public List<Subscription> getAllByUser(User user);
    public List<Subscription> getAllBySession(Session session);
    public List<Subscription> getAllSubscriptions();
}
