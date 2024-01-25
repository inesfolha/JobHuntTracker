package com.jobhunttracker.JobHuntTracker.service;

import com.jobhunttracker.JobHuntTracker.entity.User;
import com.jobhunttracker.JobHuntTracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User createUser(String username, String email, String password) {
        try {
            User user = new User(username, email, password);
            return userRepository.save(user);
            //logger.info("User Successfully created");
        } catch (DuplicateKeyException e) {
            // Handle the case where a user with the same email already exists
            throw new RuntimeException("Email already exists");
            //logger.error("Error creating account: Email already exists");
        }
    }
}

