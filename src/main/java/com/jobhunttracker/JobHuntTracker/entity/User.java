package com.jobhunttracker.JobHuntTracker.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;

@Data @Document(collection = "Users")
public class User {
    @Id
    private String id;
    private LoginCredentials loginCredentials;
    private UserProfile userProfile; //Object with info on user skills and job preferences
    private ApplicationS userApplications; // object with info on the applied jobs
    private LocalDateTime created;

    public User(String username, String email, String password) {

        // Hash the password
        String hashedPassword = hashPassword(password);

        // Create LoginCredentials Object with the info
        this.loginCredentials = new LoginCredentials(email, hashedPassword, username);
        this.userProfile = new UserProfile(); // Initialize as empty
        this.userApplications = new ApplicationS(); // Initialize as empty
        this.created = LocalDateTime.now();
    }


    private String hashPassword(String password) {
        // Using BCryptPasswordEncoder for password hashing
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(password);
    }
}

