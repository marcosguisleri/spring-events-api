package br.dev.guisleri.events.service;

import br.dev.guisleri.events.exception.NotFoundException;
import br.dev.guisleri.events.model.Session;
import br.dev.guisleri.events.repo.ConferenceRepo;
import br.dev.guisleri.events.repo.SessionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionService implements ISessionService{

    private final ConferenceService conferenceService;
    private final ConferenceRepo conferenceRepo;
    private SessionRepo sessionRepo;

    public SessionService(SessionRepo sessionRepo, ConferenceService conferenceService, ConferenceRepo conferenceRepo) {
        this.sessionRepo = sessionRepo;
        this.conferenceService = conferenceService;
        this.conferenceRepo = conferenceRepo;
    }

    @Override
    public Session addSession(Session session) {
        return sessionRepo.save(session);
    }

    @Override
    public List<Session> getAllSessions() {
        return sessionRepo.findAll();
    }

    @Override
    public Session getSessionById(Integer id) {
        return sessionRepo.findById(id).orElseThrow(() -> new NotFoundException("Session not found - id: " + id));
    }

}
