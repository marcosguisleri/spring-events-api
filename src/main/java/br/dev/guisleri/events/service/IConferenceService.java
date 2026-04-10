package br.dev.guisleri.events.service;

import br.dev.guisleri.events.model.Conference;

import java.util.List;

public interface IConferenceService {
    public Conference addConference(Conference conference);
    public Conference getConferenceById(Integer id);
    public List<Conference> getAllConferences();
}
