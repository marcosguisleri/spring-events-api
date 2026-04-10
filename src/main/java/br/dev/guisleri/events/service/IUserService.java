package br.dev.guisleri.events.service;

import br.dev.guisleri.events.model.User;

import java.util.List;

public interface IUserService {
    public User addUser(User user);
    public User getUserById(Integer id);
    public User getUserByEmail(String email);
    public List<User> getAllUsers();
}
