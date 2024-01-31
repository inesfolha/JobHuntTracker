package com.jobhunttracker.JobHuntTracker.service;

import com.jobhunttracker.JobHuntTracker.entity.User;
import com.jobhunttracker.JobHuntTracker.repository.UserRepository;
import com.jobhunttracker.JobHuntTracker.utilities.HelperMethods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service @Slf4j
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();

    }

    public User createUser(String username, String email, String password) {
        try {
            User user = new User(username, email, password);
            return userRepository.save(user);

        } catch (DuplicateKeyException e) {
            // Handle the case where a user with the same email already exists
            log.error("Error creating account: Email already exists");
            throw new RuntimeException("Email already exists");
        }

    }

    public User getUserDetails(String id) {

        return userRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("User not found with id: " + id));
    }

    public String deleteUser(String id, String password) {

        User userToDelete = getUserDetails(id);

        //compare the password with the one in the db
        if (HelperMethods.verifyPassword(password, userToDelete.getLoginCredentials().getPassword())) {
            userRepository.delete(userToDelete);
            return "User successfully deleted.";
        } else {
            return "Incorrect password";
        }


    }
    public String AdminDeleteUser(String id) {
        userRepository.deleteById(id);
        return "User successfully deleted.";
    }
}