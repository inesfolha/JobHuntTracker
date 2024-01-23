package com.jobhunttracker.JobHuntTracker.service;

import com.jobhunttracker.JobHuntTracker.entity.User;
import com.jobhunttracker.JobHuntTracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User createUser(String username, String email, String password) {
        User user = new User(username, email, password);
        return userRepository.save(user);
    }
}
