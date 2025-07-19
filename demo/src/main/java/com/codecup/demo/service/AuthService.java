package com.codecup.demo.service;

import com.codecup.demo.model.User;
import com.codecup.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String register(User user) {
        if (userRepository.findByUsername(user.getUsername()) != null) {
            return "Username already exists!";
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "User registered successfully!";
    }

    public String login(User user) {
        User dbUser = userRepository.findByUsername(user.getUsername());
        if (dbUser == null) return "User not found!";
        if (!passwordEncoder.matches(user.getPassword(), dbUser.getPassword())) {
            return "Incorrect password!";
        }
        return "Login successful!";
    }
}
