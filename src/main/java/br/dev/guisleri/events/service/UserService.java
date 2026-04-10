package br.dev.guisleri.events.service;

import br.dev.guisleri.events.model.User;
import br.dev.guisleri.events.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    private UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found - id: " + id));
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepo.findByEmail(email).orElseThrow(() -> new RuntimeException("User not found - email: " + email));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

}
