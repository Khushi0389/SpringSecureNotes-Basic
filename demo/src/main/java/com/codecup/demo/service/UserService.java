package com.codecup.demo.service;
import com.codecup.demo.model.User;
import com.codecup.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(int id, User user) {
        user.setId(id); // Ensure same ID
        return userRepository.save(user);
    }

    public String deleteUser(int id) {
        userRepository.deleteById(id);
        return "Deleted user with ID: " + id;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
