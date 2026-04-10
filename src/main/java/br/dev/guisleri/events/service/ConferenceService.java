package br.dev.guisleri.events.service;

import br.dev.guisleri.events.exception.NotFoundException;
import br.dev.guisleri.events.model.Conference;
import br.dev.guisleri.events.repo.ConferenceRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConferenceService implements IConferenceService{

    private ConferenceRepo conferenceRepo;

    public ConferenceService(ConferenceRepo conferenceRepo) {
        this.conferenceRepo = conferenceRepo;
    }

    @Override
    public Conference addConference(Conference conference) {
        return conferenceRepo.save(conference);
    }

    @Override
    public Conference getConferenceById(Integer id) {
        return conferenceRepo.findById(id).orElseThrow(() -> new NotFoundException("Conference not found - id: " + id));
    }

    @Override
    public List<Conference> getAllConferences() {
        return conferenceRepo.findAll();
    }

}
