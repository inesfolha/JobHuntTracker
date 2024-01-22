package com.jobhunttracker.JobHuntTracker.classes;
import java.time.LocalDateTime;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Data @Document
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
        this.loginCredentials = new LoginCredentials(username, email, hashedPassword);

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

