package br.dev.guisleri.events.repo;

import br.dev.guisleri.events.model.Conference;
import org.springframework.data.repository.ListCrudRepository;

public interface ConferenceRepo extends ListCrudRepository<Conference, Integer> {

}
