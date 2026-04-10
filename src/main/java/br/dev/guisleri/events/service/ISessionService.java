package br.dev.guisleri.events.service;

import br.dev.guisleri.events.model.Session;

import java.util.List;

public interface ISessionService {
    public Session addSession(Session session);
    public List<Session> getAllSessions();
    public Session getSessionById(Integer id);
}
