package com.seuusuario.crud.service;

import com.seuusuario.crud.model.User;
import com.seuusuario.crud.repository.UserRepository;

import java.util.List;

public class UserService {
    private final UserRepository userRepository = new UserRepository();

    public void createUser(User user) {
        userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id);
    }

    public boolean deleteUser(Long id) {
        return userRepository.deleteById(id);
    }

    public boolean updateUser(User user) {
        return userRepository.update(user);
    }
}
