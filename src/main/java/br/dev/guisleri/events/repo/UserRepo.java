package br.dev.guisleri.events.repo;

import br.dev.guisleri.events.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface UserRepo extends ListCrudRepository<User, Integer> {
    public Optional<User> findByEmail(String email);
}
