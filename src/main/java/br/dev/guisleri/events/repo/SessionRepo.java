package br.dev.guisleri.events.repo;

import br.dev.guisleri.events.model.Session;
import org.springframework.data.repository.ListCrudRepository;

public interface SessionRepo extends ListCrudRepository<Session, Integer> {



}
